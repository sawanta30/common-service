package com.ril.utils;

import org.slf4j.Logger;

public class LoggerFactory {

    Logger logger = org.slf4j.LoggerFactory.getLogger("");

    public static Logger make(){
        return org.slf4j.LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());

    }



}
