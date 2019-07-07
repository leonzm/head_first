package com.company.chapter_07;

/**
 * 短信发送具体模板实现
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class SmsSend extends AbstractSend {

    @Override
    public void doSend(String text) {
        System.out.println("短信发送：" + text);
    }

}
