package com.hellojd.demo.spring.aspect2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 @author:zhaoguoyu
 @date:2018/8/9
 */
@Configuration
@Slf4j
@Aspect
public class SpringLogAspect2 {
  @Before("execution(* com.hellojd.demo.*.*(..))")
  public void beforeLog(){
    log.info("spring @Aspect 准备执行任务");
  }

  @After("execution(* com.hellojd.demo.*.*(..))")
  public void afterLog(){
    log.info("spring @Aspect 准备执行任务");
  }
}
