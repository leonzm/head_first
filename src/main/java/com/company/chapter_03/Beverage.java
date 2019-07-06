package com.company.chapter_03;

/**
 * 饮料超类
 *
 * @Author: Leon
 * @CreateDate: 2019/7/5
 * @Description:
 */
public abstract class Beverage {

    public String description = "Unknow Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
