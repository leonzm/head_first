package com.company.chapter_15.impl;

import com.company.chapter_15.Node;
import com.company.chapter_15.SymbolNode;

/**
 * 乘法终结表达式
 *
 * @author Leon
 * @date 2019/7/14
 * @description
 */
public class MulNode extends SymbolNode {

    public MulNode(Node left, Node right) {
        super(left,right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }

}
