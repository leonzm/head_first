package com.company.chapter_19.impl;

import com.company.chapter_19.VoteManager;
import com.company.chapter_19.VoteState;

/**
 * 具体状态类——黑名单
 *
 * @author Leon
 * @date 2019/7/17
 * @description
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }

}
