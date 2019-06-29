package com.company.chapter_01;

import com.company.chapter_01.fly.impl.FlyWithWings;
import com.company.chapter_01.quack.impl.DefaultQuack;

/**
 * 具体类-红头鸭
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new DefaultQuack());
    }

    @Override
    public void swim() {
        System.out.println("红头鸭游泳~");
    }

    @Override
    public void display() {
        System.out.println("红头鸭的展示~");
    }

}
