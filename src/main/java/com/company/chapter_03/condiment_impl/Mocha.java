package com.company.chapter_03.condiment_impl;

import com.company.chapter_03.Beverage;
import com.company.chapter_03.Condiment;

/**
 * 调料：摩卡
 *
 * @Author: Leon
 * @CreateDate: 2019/7/5
 * @Description:
 */
public class Mocha extends Condiment {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getCondimentDescription() {
        return "Mocha";
    }

    @Override
    public double getCondimentCost() {
        return 0.20;
    }

}
