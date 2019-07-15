package com.company.chapter_16;

/**
 * 聊天室的用户
 *
 * @author Leon
 * @date 2019/7/15
 * @description
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    /**
     * 发送消息
     *
     * @param message
     */
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
