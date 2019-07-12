package com.company.chapter_13;

import java.lang.reflect.Proxy;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Hello hello = new EnglishHello();
        Hello helloProxy = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class},
                new HelloProxy(hello));
        System.out.println(helloProxy.sayHello("zhangsan"));
        // Before invoke
        // After invoke
        // Hello, zhangsan
    }

}
