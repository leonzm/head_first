package com.company.chapter_07;

/**
 * 邮件发送具体模板实现
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class MailSend extends AbstractSend {

    @Override
    public void doSend(String text) {
        System.out.println("邮件发送：" + text);
    }

}
