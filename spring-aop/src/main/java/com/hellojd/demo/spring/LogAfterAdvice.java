package com.hellojd.demo.spring;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class LogAfterAdvice implements AfterReturningAdvice {
  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
    log.info("spring proxyFactory 执行任务完成");
  }
}
