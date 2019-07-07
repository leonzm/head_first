package com.company.chapter_08;

/**
 * 容器接口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public interface Container<T> {

    Iterator<T> iterable();

}
