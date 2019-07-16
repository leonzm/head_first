package com.company.chapter_18;

import java.util.ArrayList;
import java.util.List;

/**
 * 看守类
 *
 * @author Leon
 * @date 2019/7/16
 * @description
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    /**
     * 记录快照
     *
     * @param state
     */
    public void add(Memento state){
        mementoList.add(state);
    }

    /**
     * 获取快照
     *
     * @param index
     * @return
     */
    public Memento get(int index){
        return mementoList.get(index);
    }

}
