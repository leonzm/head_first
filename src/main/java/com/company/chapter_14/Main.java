package com.company.chapter_14;

import com.company.chapter_14.impl.InfoLogger;
import com.company.chapter_14.impl.ErrorLogger;
import com.company.chapter_14.impl.DebugLogger;
import com.company.chapter_14.impl.WarnLogger;

/**
 * 测试入口
 *
 * @author Leon
 * @date 2019/7/12
 * @description
 */
public class Main {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger debugLogger = new DebugLogger();
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger warnLogger = new WarnLogger();
        AbstractLogger errorLogger = new ErrorLogger();

        errorLogger.setNextLogger(warnLogger);
        warnLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        // Debug::Logger: This is a debug level information.
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        // Info::Logger: This is an information.
        loggerChain.logMessage(AbstractLogger.WARN, "This is a warn level information.");
        // Warn::Logger: This is a warn level information.
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
        // Error::Logger: This is an error information.
    }

}
