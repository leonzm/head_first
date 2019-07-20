package com.company.chapter_20.impl;

import com.company.chapter_20.ComputerPart;
import com.company.chapter_20.ComputerPartVisitor;

/**
 * 电脑具体部件 - 电脑
 *
 * @author Leon
 * @date 2019/7/20
 * @description
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
