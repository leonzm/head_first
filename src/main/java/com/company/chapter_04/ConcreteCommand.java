package com.company.chapter_04;

/**
 * 具体命令角色
 *
 * @Author: Leon
 * @CreateDate: 2019/7/6
 * @Description:
 */
public class ConcreteCommand implements Command {

    /**
     * 持有相应的接收者对象
     */
    private Receiver receiver;

    /**
     * 构造方法
     * @param receiver
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 通常会转调接收者的形影方法，让接收者来真正执行功能
        receiver.action();
    }

}
