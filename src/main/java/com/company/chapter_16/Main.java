package com.company.chapter_16;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/15
 * @description
 */
public class Main {

    public static void main(String[] args) {
        User zhangsan = new User("Zhangsan");
        User lisi = new User("Lisi");

        zhangsan.sendMessage("Hi! Lisi!");
        lisi.sendMessage("Hello! Zhangsan!");
    }

}
