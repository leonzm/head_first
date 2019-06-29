package com.company.chapter_01;

import com.company.chapter_01.fly.impl.FlyWithWings;
import com.company.chapter_01.quack.impl.DefaultQuack;

/**
 * 具体类-野鸭
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new DefaultQuack());
    }

    @Override
    public void swim() {
        System.out.println("野鸭子游泳~");
    }

    @Override
    public void display() {
        System.out.println("野鸭子的展示~");
    }

}
