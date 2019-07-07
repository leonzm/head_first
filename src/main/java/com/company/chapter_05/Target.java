package com.company.chapter_05;

/**
 * 目标角色
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    void sampleOperation1();

    /**
     * 这是源类Adapteee没有的方法
     */
    void sampleOperation2();

}
