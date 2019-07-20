package com.company.chapter_20;

/**
 * 电脑部件抽象
 *
 * @author Leon
 * @date 2019/7/20
 * @description
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
