package com.company.chapter_03;

import com.company.chapter_03.beverage_impl.DarkRoast;
import com.company.chapter_03.beverage_impl.Espresso;
import com.company.chapter_03.beverage_impl.HouseBlend;
import com.company.chapter_03.condiment_impl.Mocha;
import com.company.chapter_03.condiment_impl.Soy;
import com.company.chapter_03.condiment_impl.Whip;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/5
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        // 浓缩咖啡，无调料
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());
        // Espresso $ 1.99

        // 烘焙咖啡，调料：两份摩卡、一份奶油
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
        // DarkRoast, Mocha, Mocha, Whip $ 3.69

        // House Blend 咖啡，调料：豆浆、摩卡、奶油
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
        // House Blend Coffe, Soy, Mocha, Whip $ 1.79
    }

}
