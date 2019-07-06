package com.company.chapter_03.beverage_impl;

import com.company.chapter_03.Beverage;

/**
 * 烘焙咖啡
 *
 * @Author: Leon
 * @CreateDate: 2019/7/6
 * @Description:
 */
public class DarkRoast  extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.99;
    }

}
