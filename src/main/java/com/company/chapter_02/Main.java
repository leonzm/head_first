package com.company.chapter_02;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/4
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        SimpleObservable doc = new SimpleObservable();
        SimpleObserver view1 = new SimpleObserver("观察者1号", doc);
        SimpleObserver view2 = new SimpleObserver("观察者2号", doc);
        doc.setData(1);
        doc.setData(2);
        // 观察者2号 发现 被观察者（主题） 改变为：1
        // 观察者1号 发现 被观察者（主题） 改变为：1
        // 观察者2号 发现 被观察者（主题） 改变为：2
        // 观察者1号 发现 被观察者（主题） 改变为：2
    }

}
