package com.company.chapter_02;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者类
 *
 * @Author: Leon
 * @CreateDate: 2019/7/4
 * @Description:
 */
public class SimpleObserver implements Observer {

    private String name;

    public SimpleObserver(String name, SimpleObservable simpleObservable) {
        this.name = name;
        simpleObservable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) { // data为任意对象，用于传递参数
        System.out.println(name + " 发现 被观察者（主题） 改变为：" + ((SimpleObservable)observable).getData());
    }

}
