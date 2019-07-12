package com.company.chapter_14.impl;

import com.company.chapter_14.AbstractLogger;

/**
 * 具体的记录器类
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(){
        this.level = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info::Logger: " + message);
    }

}
