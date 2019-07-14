package com.company.chapter_15.impl;

import com.company.chapter_15.Node;

/**
 * 终结表达式
 *
 * @author Leon
 * @date 2019/7/14
 * @description
 */
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value=value;
    }

    @Override
    public int interpret() {
        return this.value;
    }

}
