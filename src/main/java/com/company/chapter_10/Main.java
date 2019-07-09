package com.company.chapter_10;

import com.alibaba.fastjson.JSON;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/9
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Builder builder = new SimpleBuilder();
        builder.buildBasic().buildWalls().roofed();
        Product product = builder.buildProduct();
        System.out.println(JSON.toJSONString(product));
        // {"basic":"打好基础","roofed":"封顶大吉","wall":"砌墙"}
    }

}
