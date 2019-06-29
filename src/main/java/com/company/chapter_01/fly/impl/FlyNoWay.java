package com.company.chapter_01.fly.impl;

import com.company.chapter_01.fly.FlyBehavior;

/**
 * 无法飞行
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("什么事也不做，不会飞呢");
    }

}
