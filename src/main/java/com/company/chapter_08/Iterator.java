package com.company.chapter_08;

/**
 * 迭代器接口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public interface Iterator<T> {

    boolean hasNext();

    <T> T next();

}
