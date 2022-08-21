package com.ril.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({UserNotFoundException.class})
    public Map<String,String> handleUserNotFoundException(UserNotFoundException ex){
        Map<String,String> map = new HashMap<>(2,1f);
        map.put("Error",ex.getMessage());
        return map;
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Map<String,String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex){
       Map<String,String> map = new HashMap<>();
       map.put("error",ex.getMessage());
       map.put("description",ex.getLocalizedMessage());
       return map;
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleHttpMessageNotReadableException(MethodArgumentNotValidException ex){
        Map<String,String> map = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(err->{
            map.put(err.getField(), err.getDefaultMessage());
        });
        //map.put("error",ex.getMessage());
        //map.put("description",ex.getLocalizedMessage());
        return map;
    }

    private class ResponseData{
        private int appErrorCode;
        private int httpStatusCode;
        private String message;
        private String description;

        public ResponseData(int appErrorCode, int httpStatusCode, String message) {
            this.appErrorCode = appErrorCode;
            this.httpStatusCode = httpStatusCode;
            this.message = message;
            this.description = "";
        }

        public ResponseData(int appErrorCode, int httpStatusCode, String message, String description) {
            this.appErrorCode = appErrorCode;
            this.httpStatusCode = httpStatusCode;
            this.message = message;
            this.description = description;
        }
    }


}
