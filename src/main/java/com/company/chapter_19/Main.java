package com.company.chapter_19;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/17
 * @description
 */
public class Main {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("zhangsan", "A");
        }
    }

}
