package com.company.chapter_12;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂
 *
 * @Author: Leon
 * @CreateDate: 2019/7/11
 * @Description:
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
