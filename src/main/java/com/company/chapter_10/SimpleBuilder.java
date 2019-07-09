package com.company.chapter_10;

/**
 * 具体的建造
 *
 * @Author: Leon
 * @CreateDate: 2019/7/9
 * @Description:
 */
public class SimpleBuilder implements Builder {

    private Product product;

    public SimpleBuilder() {
        product = new Product();
    }

    @Override
    public Builder buildBasic() {
        product.setBasic("打好基础");
        return this;
    }

    @Override
    public Builder buildWalls() {
        product.setWall("砌墙");
        return this;
    }

    @Override
    public Builder roofed() {
        product.setRoofed("封顶大吉");
        return this;
    }

    @Override
    public Product buildProduct() {
        return product;
    }

}
