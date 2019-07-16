package com.company.chapter_18;

/**
 * 备忘录类
 *
 * @author Leon
 * @date 2019/7/16
 * @description
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
