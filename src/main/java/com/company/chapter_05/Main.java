package com.company.chapter_05;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        // 类适配器
        Adapter1 adapter1 = new Adapter1();
        adapter1.sampleOperation1();  // Adaptee.sampleOperation1()
        adapter1.sampleOperation2();  // Adapter1.sampleOperation2()

        // 对象适配器
        Adapter2 adapter2 = new Adapter2(adaptee);
        adapter2.sampleOperation1();  // Adaptee.sampleOperation1()
        adapter2.sampleOperation2();  // Adapter2.sampleOperation2()
    }

}
