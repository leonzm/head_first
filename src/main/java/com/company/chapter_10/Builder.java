package com.company.chapter_10;

/**
 * 抽象建造
 *
 * @Author: Leon
 * @CreateDate: 2019/7/9
 * @Description:
 */
public interface Builder {

    /**
     * 打基础
     */
    Builder buildBasic();

    /**
     * 砌墙
     */
    Builder buildWalls();

    /**
     * 封顶
     */
    Builder roofed();

    /**
     * 造房子
     * @return
     */
    Product buildProduct();
    
}
