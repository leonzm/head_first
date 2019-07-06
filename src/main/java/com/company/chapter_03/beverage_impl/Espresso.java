package com.company.chapter_03.beverage_impl;

import com.company.chapter_03.Beverage;

/**
 * 浓缩咖啡
 *
 * @Author: Leon
 * @CreateDate: 2019/7/5
 * @Description:
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
