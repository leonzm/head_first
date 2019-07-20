package com.company.chapter_20;

import com.company.chapter_20.impl.Computer;
import com.company.chapter_20.impl.ComputerPartDisplayVisitor;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/20
 * @description
 */
public class Main {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
