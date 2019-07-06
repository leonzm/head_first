package com.company.chapter_03;

/**
 * 调料超类
 *
 * @Author: Leon
 * @CreateDate: 2019/7/5
 * @Description:
 */
public abstract class Condiment extends Beverage {

    private Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + getCondimentDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + getCondimentCost();
    }

    public abstract String getCondimentDescription();

    public abstract double getCondimentCost();

}
