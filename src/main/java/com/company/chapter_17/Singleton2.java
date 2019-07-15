package com.company.chapter_17;

/**
 * 单例模式，实现方式：静态内部类
 *
 * @author Leon
 * @date 2019/7/15
 * @description
 */
public class Singleton2 {

    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    private Singleton2() {}

    /**
     * 获取单例对象
     *
     * @return
     */
    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
