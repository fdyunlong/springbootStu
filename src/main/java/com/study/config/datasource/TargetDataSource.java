package com.study.config.datasource;

import java.lang.annotation.*;

/**
 * 指定数据源注解类
 * 在方法上使用，用于指定使用哪个数据源
 * Created by Administrator on 2017/5/23.
 */


@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}
