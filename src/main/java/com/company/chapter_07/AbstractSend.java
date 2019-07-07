package com.company.chapter_07;

/**
 * 消息发送。抽象模板角色类
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public abstract class AbstractSend {

    /**
     * 模板方法
     */
    public final void send() {
        String text = getContent();
        doSend(text);
    }

    /**
     * 基本方法，已经实现
     * @return
     */
    private String getContent() {
        return "content";
    }

    /**
     * 抽象方法，通知方法的声明（由子类实现）
     * @param text
     */
    public abstract void doSend(String text);

}
