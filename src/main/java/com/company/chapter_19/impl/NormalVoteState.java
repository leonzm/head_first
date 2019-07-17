package com.company.chapter_19.impl;

import com.company.chapter_19.VoteManager;
import com.company.chapter_19.VoteState;

/**
 * 具体状态类——正常投票
 *
 * @author Leon
 * @date 2019/7/17
 * @description
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }

}
