package com.company.chapter_03.condiment_impl;

import com.company.chapter_03.Beverage;
import com.company.chapter_03.Condiment;

/**
 * 调料：豆浆
 *
 * @Author: Leon
 * @CreateDate: 2019/7/6
 * @Description:
 */
public class Soy extends Condiment {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }

}
