package com.company.chapter_07;

/**
 * 测试入口
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        AbstractSend send1 = new MailSend();
        send1.send();

        AbstractSend send2 = new SmsSend();
        send2.send();
    }

}
