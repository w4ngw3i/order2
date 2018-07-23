package com.wangwei.order2.utils;

import java.util.Random;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午1:06
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
