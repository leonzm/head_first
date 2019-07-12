package com.company.chapter_14;

/**
 * 记录器抽象类
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public abstract class AbstractLogger {

    // 日志的三个级别
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int WARN = 3;
    public static int ERROR = 4;

    // 当前日志记录器的级别
    protected int level;
    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    /**
     * 处理消息
     *
     * @param level
     * @param message
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
            return;  // 有处理即可以退出责任链
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
        // 到这里时，责任链上没有没处理
    }

    /**
     * 打印消息
     *
     * @param message
     */
    abstract protected void write(String message);

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

}
