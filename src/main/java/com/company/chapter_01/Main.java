package com.company.chapter_01;

import java.util.Arrays;
import java.util.List;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/6/29
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        // 野鸭子, 红头鸭, 橡皮鸭, 诱饵鸭
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new RedHeadDuck(), new RubberDuck(), new DecoyDuck());
        ducks.forEach(duck -> {
            duck.performFly();
            duck.performQuack();
            duck.swim();
            duck.display();
            System.out.println("");
        });
    }

}
