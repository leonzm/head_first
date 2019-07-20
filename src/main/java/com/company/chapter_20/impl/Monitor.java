package com.company.chapter_20.impl;

import com.company.chapter_20.ComputerPart;
import com.company.chapter_20.ComputerPartVisitor;

/**
 * 电脑具体部件 - 监控
 *
 * @author Leon
 * @date 2019/7/20
 * @description
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
