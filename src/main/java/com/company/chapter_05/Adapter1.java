package com.company.chapter_05;

/**
 * 适配器角色（类适配器）
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Adapter1 extends Adaptee implements Target {

    /**
     * 由于源类 Adaptee 没有方法 sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        System.out.println("Adapter1.sampleOperation2()");
    }


}
