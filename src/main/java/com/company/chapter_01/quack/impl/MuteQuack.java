package com.company.chapter_01.quack.impl;

import com.company.chapter_01.quack.QuackBehavior;

/**
 * 沉默鸭子的叫声
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("什么事也不做，不会叫呢");
    }

}
