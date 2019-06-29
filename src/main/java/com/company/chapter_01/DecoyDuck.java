package com.company.chapter_01;

import com.company.chapter_01.fly.impl.FlyNoWay;
import com.company.chapter_01.quack.impl.MuteQuack;

/**
 * 具体类-诱饵鸭
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void swim() {
        System.out.println("诱饵鸭游泳~");
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭的展示~");
    }

}
