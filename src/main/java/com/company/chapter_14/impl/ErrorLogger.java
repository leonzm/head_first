package com.company.chapter_14.impl;

import com.company.chapter_14.AbstractLogger;

/**
 * 具体的记录器类
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(){
        this.level = ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }

}
