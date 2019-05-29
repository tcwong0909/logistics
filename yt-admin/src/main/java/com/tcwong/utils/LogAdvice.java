package com.tcwong.utils;

import com.tcwong.bean.Syslog;
import com.tcwong.bean.User;
import com.tcwong.common.Log;
import com.tcwong.service.ISyslogService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * 系统日志全局处理
 */
@Aspect
public class LogAdvice {

    private Logger logger = Logger.getLogger(LogAdvice.class);

    @Resource
    private ISyslogService syslogService;

    /**
     * 切入点
     */
    @Pointcut("execution(* com.tcwong.controller.*.*(..))")
    public void controllerAspect() {

    }
    @AfterReturning(pointcut = "controllerAspect()")
    public void afterReturning(JoinPoint joinPoint) throws ClassNotFoundException {
        Integer fkTypeid = null;
        Integer fkUserid = null;
        String procname = "";
        String ip = "";
        Date checkintime = new Date();
        Integer isexception = 1;
        String behavior = "";
        String parameters = "";
        String exception = "";
        //用户ID
        fkUserid = ((User) (SecurityUtils.getSubject().getSession().getAttribute("user"))).getUserid();
        //获取类名
        String targetName = joinPoint.getTarget().getClass().getName();
        //获取到方法名
        procname = joinPoint.getSignature().getName();
        //获取到参数
        Object[] args = joinPoint.getArgs();
        if (args.length>0){
            HttpServletRequest request =  ((HttpServletRequest)(args[args.length - 1]));
            ip = IP.getIpAddress(request);
        }
        //获取字节码对象
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(procname)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == args.length) {
                    try {
                        behavior = method.getAnnotation(Log.class).behavior();
                        fkTypeid = method.getAnnotation(Log.class).fkTypeid().getNum();
                    } catch (Exception e) {

                       logger.info("不向库中添加信息");
                        return;
                    }
                    break;
                }
            }
        }
        if (args.length > 1) {
            args = Arrays.copyOfRange(args, 0, args.length - 1);
        }
        parameters = Arrays.toString(args);
        Syslog syslog = new Syslog(fkTypeid, fkUserid, procname, ip, checkintime, isexception, behavior, parameters, exception);
        syslogService.addSyslog(syslog);
    }

    @AfterThrowing(pointcut = "controllerAspect()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Throwable e) throws ClassNotFoundException {
        Integer fkTypeid = null;
        Integer fkUserid = null;
        String procname = "";
        String ip = "";
        Date checkintime = new Date();
        Integer isexception = 2;
        String behavior = "";
        String parameters = "";
        String exception = "";
        //用户ID
        fkUserid = ((User) (SecurityUtils.getSubject().getSession().getAttribute("user"))).getUserid();
        //获取类名
        String targetName = joinPoint.getTarget().getClass().getName();
        //获取到方法名
        procname = joinPoint.getSignature().getName();
        //获取到参数
        Object[] args = joinPoint.getArgs();
        if (args.length>0){
            HttpServletRequest request =  ((HttpServletRequest)(args[args.length - 1]));
            ip = IP.getIpAddress(request);
        }
        //获取字节码对象
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(procname)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == args.length) {
                    try {
                        behavior = method.getAnnotation(Log.class).behavior();
                        fkTypeid = method.getAnnotation(Log.class).fkTypeid().getNum();
                        e.getLocalizedMessage();
                    } catch (Exception e1) {
                        logger.info("不向库中添加信息");
                        return;
                    }
                    break;
                }
            }
        }
        exception = e.getMessage();
        if (args.length > 1) {
            args = Arrays.copyOfRange(args, 0, args.length - 1);
        }
        parameters = Arrays.toString(args);
        Syslog syslog = new Syslog(fkTypeid, fkUserid, procname, ip, checkintime, isexception, behavior, parameters, exception);
        syslogService.addSyslog(syslog);
        System.out.println("AfterThrowing++++++++++");
    }

}
