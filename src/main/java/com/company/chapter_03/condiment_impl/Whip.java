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

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getCondimentDescription() {
        return "Whip";
    }

    @Override
    public double getCondimentCost() {
        return 0.30;
    }

}
