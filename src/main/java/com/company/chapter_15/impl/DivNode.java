package com.company.chapter_15.impl;

import com.company.chapter_15.Node;
import com.company.chapter_15.SymbolNode;

/**
 * 除法终结表达式
 *
 * @author Leon
 * @date 2019/7/14
 * @description
 */
public class DivNode extends SymbolNode {

    public DivNode(Node left,Node right){
        super(left,right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() / super.right.interpret();
    }

}
