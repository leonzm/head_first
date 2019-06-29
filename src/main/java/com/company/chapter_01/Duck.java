package com.company.chapter_01;

import com.company.chapter_01.fly.FlyBehavior;
import com.company.chapter_01.quack.QuackBehavior;

/**
 * 鸭子抽象类
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description: 变动的行为定义为接口，注入进来后包装执行
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void swim();

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
