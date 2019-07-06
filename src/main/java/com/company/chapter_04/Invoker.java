package com.company.chapter_04;

/**
 * 请求者角色
 *
 * @Author: Leon
 * @CreateDate: 2019/7/6
 * @Description:
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command;

    /**
     * 构造方法
     * @param command
     */
    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action() {
        command.execute();
    }

}
