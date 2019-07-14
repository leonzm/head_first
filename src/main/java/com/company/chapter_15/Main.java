package com.company.chapter_15;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/14
 * @description
 */
public class Main {

    public static void main(String[] args) {
        String statement = "3 * 2 * 4 / 6 % 5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result = calculator.compute();
        System.out.println(statement + " = " + result);
        // 3 * 2 * 4 / 6 % 5 = 4
    }

}
