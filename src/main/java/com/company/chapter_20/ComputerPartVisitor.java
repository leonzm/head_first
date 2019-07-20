package com.company.chapter_20;

import com.company.chapter_20.impl.Computer;
import com.company.chapter_20.impl.Keyboard;
import com.company.chapter_20.impl.Monitor;
import com.company.chapter_20.impl.Mouse;

/**
 * 电脑部件访问者抽象
 *
 * @author Leon
 * @date 2019/7/20
 * @description
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
