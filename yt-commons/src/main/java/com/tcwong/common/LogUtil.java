package com.tcwong.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;

/**
 * 日志工具
 */
public class LogUtil {

    private static final Logger LOG = LoggerFactory.getLogger(LogUtil.class);

    public static SimpleDateFormat DATE_FORMAT =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void error(YTException e){
        LOG.error("ErrorCode is" +e.getErrorCode()+",message is" + e.getMessage());

    }

    public static void error(Exception e){
        LOG.error("ErrorCode is" + -1 +",message is" + e.getMessage());
    }



}
