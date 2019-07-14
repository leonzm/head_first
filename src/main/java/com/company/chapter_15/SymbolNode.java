package com.company.chapter_15;

/**
 * 非终结表达式抽象类
 *
 * @author Leon
 * @date 2019/7/14
 * @description
 */
public abstract class SymbolNode implements Node {

    protected Node left;
    protected Node right;

    public SymbolNode(Node left,Node right) {
        this.left=left;
        this.right=right;
    }

}
