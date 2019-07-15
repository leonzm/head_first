package com.company.chapter_16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 聊天室
 *
 * @author Leon
 * @date 2019/7/15
 * @description
 */
public class ChatRoom {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void showMessage(User user, String message){
        System.out.println(String.format("%s [%s]: %s", dateFormat.format(new Date(System.currentTimeMillis())),
                user.getName(), message));
    }

}
