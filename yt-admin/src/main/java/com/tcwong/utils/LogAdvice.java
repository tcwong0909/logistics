package com.tcwong.utils;

import com.tcwong.bean.Syslog;
import com.tcwong.bean.User;
import com.tcwong.common.Log;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class LogAdvice {

    private Logger logger = Logger.getLogger(LogAdvice.class);

    @Pointcut("execution(* com.tcwong.controller.*.*(..))")
    public void controllerAspect() {

    }

//    @AfterReturning("controllerAspect()")
//    public void after(JoinPoint joinPoint) {
//        try {
//        //String ip = IP.getIpAddress(request);
//        String username = ((User) (SecurityUtils.getSubject().getSession().getAttribute("user"))).getUsername();
//        String targetName = joinPoint.getTarget().getClass().getName();
//        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//        Class targetClass = Class.forName(targetName);
//        Method[] methods = targetClass.getMethods();
//        String behavior = "";
//        String parameters = "";
//            for (Method method : methods) {
//                if (method.getName().equals(methodName)) {
//                    Class<?>[] clazzs = method.getParameterTypes();
//                    if (clazzs.length == args.length) {
//                        if (!method.isAnnotationPresent(Log.class)){
//                            return;
//                        }
//                        behavior = method.getAnnotation(Log.class).behavior();
//                        for (int i = 0; i < args.length; i++) {
//                            parameters = parameters+args[i]+(i ==args.length-1 ?"":",");
//                        }
//                        break;
//
//                    }
//                }
//            }
//
//            logger.info("log 输出+++++");
//            logger.info("请求方法:"+
//                    (joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName()+"()"));
//            logger.info("f方法描述："+behavior);
//            logger.info("请求人"+username);
//            logger.info("请求参数:"+parameters);
//            logger.info("写入数据库");
//            Syslog syslog = new Syslog();
//            syslog.setProcname(joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName()+"()");
//            syslog.setBehavior(behavior);
//            syslog.setCheckintime(new Date());
//            syslog.setParameters(parameters);
//            syslog.setIsexception(null);
//            syslog.setException(null);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }catch (SecurityException e){
//            e.printStackTrace();
//        }
//    }
//
//    @AfterThrowing(pointcut = "controllerAspect()",throwing = "e")
//    public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
//        String username = ((User) (SecurityUtils.getSubject().getSession().getAttribute("user"))).getUsername();
//        try {
//            String targetName = joinPoint.getTarget().getClass().getName();
//            String methodName = joinPoint.getSignature().getName();
//            Object[] args = joinPoint.getArgs();
//            Class<?> targetClass = Class.forName(targetName);
//            Method[] methods = targetClass.getMethods();
//            String behavior = "";
//            String parameters = "";
//            for (Method method : methods) {
//                if (method.getName().equals(methodName)) {
//                    Class<?>[] clazzs = method.getParameterTypes();
//                    if (clazzs.length == args.length) {
//                        if (method.isAnnotationPresent(Log.class)) {
//                            return;
//                        }
//                        behavior = method.getAnnotation(Log.class).behavior();
//                        for (int i = 0; i < args.length; i++) {
//                            parameters = parameters + args[i] + (i == args.length - 1 ? "" : ",");
//                        }
//                        break;
//                    }
//                }
//            }
//            logger.info("log 输出+++++");
//            logger.info("请求方法:"+
//                    (joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName()+"()"));
//            logger.info("f方法描述："+behavior);
//            logger.info("请求人"+username);
//            logger.info("异常信息:"+e.getMessage());
//            logger.info("异常代码："+e.getClass().getName());
//            logger.info("请求参数:"+parameters);
//            logger.info("写入数据库");
//            Syslog syslog = new Syslog();
//            syslog.setProcname(joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName()+"()");
//            syslog.setBehavior(behavior);
//            syslog.setCheckintime(new Date());
//            syslog.setParameters(parameters);
//            syslog.setIsexception(400);
//            syslog.setException(e.getMessage());
//        } catch (ClassNotFoundException e1) {
//            e.printStackTrace();
//        } catch (SecurityException e1) {
//            e.printStackTrace();
//        }
//
//
//    }

    @AfterReturning(pointcut = "controllerAspect()")
    public void afterReturning(JoinPoint joinPoint) throws ClassNotFoundException {
        Integer fkTypeid = null;
        Integer fkUserid = null;
        String procname = "";
        String ip = "";
        Date checkintime = new Date();
        Integer isexception = 0;
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
        HttpServletRequest request =  ((HttpServletRequest)(args[args.length - 1]));
        ip = IP.getIpAddress(request);
        //获取字节码对象
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(procname)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == args.length) {
                    behavior = method.getAnnotation(Log.class).behavior();
                    fkTypeid = method.getAnnotation(Log.class).fkTypeid().getNum();
                    break;
                }
            }
        }
        if (args.length > 1) {
            args = Arrays.copyOfRange(args, 0, args.length - 1);
        }
        parameters = Arrays.toString(args);
        Syslog syslog = new Syslog(fkTypeid, fkUserid, procname, ip, checkintime, isexception, behavior, parameters, exception);
        System.out.println(syslog);
        System.out.println("AfterReturning++++++++");
    }

    @AfterThrowing(pointcut = "controllerAspect()", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("AfterThrowing++++++++++");
    }

}
