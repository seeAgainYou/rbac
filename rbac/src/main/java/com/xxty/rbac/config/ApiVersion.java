package com.xxty.rbac.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface ApiVersion {
    /**
     * 分组名（即版本号），可以传入多个
     *
     * @return
     */
    String[] value();
}
