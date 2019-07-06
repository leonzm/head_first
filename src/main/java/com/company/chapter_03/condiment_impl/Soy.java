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

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getCondimentDescription() {
        return "Soy";
    }

    @Override
    public double getCondimentCost() {
        return 0.40;
    }

}
