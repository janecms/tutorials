package com.hellojd.demo.spring.aspect1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

/**
 @author:zhaoguoyu
 @date:2018/8/9
 */
@Slf4j
@Aspect
public class SpringLogAspect1 {
  @Before("execution(* com.hellojd.demo.*.*(..))")
  public void beforeLog(){
    log.info("spring @Aspect 准备执行任务");
  }

  @After("execution(* com.hellojd.demo.*.*(..))")
  public void afterLog(){
    log.info("spring @Aspect 准备执行任务");
  }
}
