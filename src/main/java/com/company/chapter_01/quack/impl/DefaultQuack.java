package com.company.chapter_01.quack.impl;

import com.company.chapter_01.quack.QuackBehavior;

/**
 * 默认鸭子的叫声
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class DefaultQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫^_^");
    }

}
