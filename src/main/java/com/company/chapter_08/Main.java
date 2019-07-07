package com.company.chapter_08;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Container<String> container = new NameContainer();
        Iterator<String> iterable = container.iterable();
        while (iterable.hasNext()) {
            String name = iterable.next();
            System.out.println(name);
        }
    }

}
