package com.company.chapter_10;

/**
 * 具体的产品---房子
 *
 * @Author: Leon
 * @CreateDate: 2019/7/9
 * @Description:
 */
public class Product {

    /**
     * 地基
     */
    private String basic;

    /**
     * 墙
     */
    private String wall;

    /**
     * 楼顶
     */
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

}
