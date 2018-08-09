package com.hellojd.demo.spring.aspect2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Configuration
@ComponentScan(basePackages = "com.hellojd.demo.spring.aspect2")
@EnableAspectJAutoProxy
public class SpringAspectApp {

}
