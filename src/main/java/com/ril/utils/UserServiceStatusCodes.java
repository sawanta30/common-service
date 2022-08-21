package com.ril.utils;

public enum UserServiceStatusCodes {
    EMPLOYEE_NOT_FOUND(400,10100,"Employee not found");
    private int httpStatusCode;
    private int appErrorCode;
    private String message;

    UserServiceStatusCodes(int httpStatusCode, int appErrorCode, String message) {
        this.httpStatusCode = httpStatusCode;
        this.appErrorCode = appErrorCode;
        this.message = message;
    }


}
