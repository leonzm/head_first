package com.company.chapter_13;

/**
 * Hello 的具体实现
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public class EnglishHello implements Hello {

    @Override
    public String sayHello(String name) {
        return String.format("Hello, %s", name);
    }

}
