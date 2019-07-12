package com.company.chapter_13;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public class HelloProxy implements InvocationHandler {

    private Hello hello;

    public HelloProxy(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke");  // 增强处理
        Object result = method.invoke(hello, args);
        System.out.println("After invoke");  // 增强处理
        return result;
    }

}
