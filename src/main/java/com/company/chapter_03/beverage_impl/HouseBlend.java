package com.company.chapter_03.beverage_impl;

import com.company.chapter_03.Beverage;

/**
 * House Blend 咖啡
 *
 * @Author: Leon
 * @CreateDate: 2019/7/5
 * @Description:
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
