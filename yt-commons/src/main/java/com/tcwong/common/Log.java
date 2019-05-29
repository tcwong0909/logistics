package com.tcwong.common;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    public String behavior() default "";
    public LogdicType fkTypeid();
}
