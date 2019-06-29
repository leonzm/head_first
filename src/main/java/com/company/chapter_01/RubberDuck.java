package com.company.chapter_01;

import com.company.chapter_01.fly.impl.FlyNoWay;
import com.company.chapter_01.quack.impl.SqueakQuack;

/**
 * 具体类-橡皮鸭
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new SqueakQuack());
    }

    @Override
    public void swim() {
        System.out.println("橡皮鸭游泳~");
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭的展示~");
    }

}
