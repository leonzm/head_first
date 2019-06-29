package com.company.chapter_01.fly.impl;

import com.company.chapter_01.fly.FlyBehavior;

/**
 * 有翅膀的飞行
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("鸭子飞呀飞︿(￣︶￣)︿");
    }

}
