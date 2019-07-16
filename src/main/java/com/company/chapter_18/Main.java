package com.company.chapter_18;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/16
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState()); // Current State: State #4
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState()); // First saved State: State #2
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState()); // Second saved State: State #3
    }

}
