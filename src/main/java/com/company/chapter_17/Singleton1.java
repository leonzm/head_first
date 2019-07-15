package com.company.chapter_17;

/**
 * 单例模式，实现方式：双校验锁
 *
 * @author Leon
 * @date 2019/7/15
 * @description
 */
public class Singleton1 {

    private volatile static Singleton1 instance;

    private Singleton1() {}

    /**
     * 获取单例对象
     *
     * @return
     */
    public static Singleton1 getInstance() {
        if (null == instance) {
            synchronized (instance) {
                if (null == instance) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

}
