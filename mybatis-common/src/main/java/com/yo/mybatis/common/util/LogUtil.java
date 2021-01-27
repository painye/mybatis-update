package com.yo.mybatis.common.util;

import org.apache.log4j.Logger;


/**
 * 日志
 */
public enum LogUtil {
    INSTANCE;

    /**
     *
     * @param t
     * @param msg
     */
    public void debug(Class t, Object msg){
        Logger.getLogger(t).debug(msg);
    }

    public void info(Class t, Object msg){
        Logger.getLogger(t).info(msg);
    }
}
