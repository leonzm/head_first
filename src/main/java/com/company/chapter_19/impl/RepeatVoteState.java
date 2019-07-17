package com.company.chapter_19.impl;

import com.company.chapter_19.VoteManager;
import com.company.chapter_19.VoteState;

/**
 * 具体状态类——重复投票
 *
 * @author Leon
 * @date 2019/7/17
 * @description
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }

}
