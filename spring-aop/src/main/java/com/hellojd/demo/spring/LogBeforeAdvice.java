package com.hellojd.demo.spring;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class LogBeforeAdvice implements MethodBeforeAdvice {
  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    log.info("spring proxyFactory 准备执行任务");
  }
}
