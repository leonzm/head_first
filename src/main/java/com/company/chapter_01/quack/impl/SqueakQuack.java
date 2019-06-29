package com.company.chapter_01.quack.impl;

import com.company.chapter_01.quack.QuackBehavior;

/**
 * 橡皮鸭的叫声
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class SqueakQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("橡皮鸭哇哇叫O(∩_∩)O~");
    }

}
