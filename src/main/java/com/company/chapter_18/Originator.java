package com.company.chapter_18;

/**
 * 发起人类
 *
 * @author Leon
 * @date 2019/7/16
 * @description
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }

}
