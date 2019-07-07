package com.company.chapter_06;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle();  // Rectangle.draw()
        shapeMaker.drawSquare();  // Square.draw()
        shapeMaker.drawCircle();  // Circle.draw()
    }

}
