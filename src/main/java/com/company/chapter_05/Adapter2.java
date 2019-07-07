package com.company.chapter_05;

/**
 * 适配器角色（对象适配器）
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 源类 Adaptee 有方法 sampleOperation1
     * 因此适配器类直接委派即可
     */
    @Override
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }

    /**
     * 源类 Adaptee 没有方法 sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2(){
        System.out.println("Adapter2.sampleOperation2()");
    }

}
