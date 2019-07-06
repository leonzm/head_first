package com.company.chapter_03.condiment_impl;

import com.company.chapter_03.Beverage;
import com.company.chapter_03.Condiment;

/**
 * 调料：鲜奶油
 *
 * @Author: Leon
 * @CreateDate: 2019/7/6
 * @Description:
 */
public class Whip extends Condiment {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }

}
