package com.company.chapter_19.impl;

import com.company.chapter_19.VoteManager;
import com.company.chapter_19.VoteState;

/**
 * 具体状态类——恶意刷票
 *
 * @author Leon
 * @date 2019/7/17
 * @description
 */
public class SpiteVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 恶意投票，取消用户的投票资格，并取消投票记录
        String str = voteManager.getMapVote().get(user);
        if (str != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }

}
