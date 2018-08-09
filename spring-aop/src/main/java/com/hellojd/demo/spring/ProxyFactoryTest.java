package com.hellojd.demo.spring;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;

import com.hellojd.demo.EchoTask;
import com.hellojd.demo.Task;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class ProxyFactoryTest {
  public static void main(String[] args) {
    EchoTask echoTask = new EchoTask();
    TargetSource echoTaskSource =new TargetSource(){
      @Override
      public Class<?> getTargetClass() {
        return EchoTask.class;
      }
      @Override
      public boolean isStatic() {
        return false;
      }

      @Override
      public Object getTarget() throws Exception {
        return echoTask;
      }

      @Override
      public void releaseTarget(Object target) throws Exception {

      }
    } ;
    ProxyFactory proxyFactory = new ProxyFactory(Task.class,echoTaskSource);
    proxyFactory.addAdvice(new LogBeforeAdvice());
    proxyFactory.addAdvice(new LogAfterAdvice());
    Task proxy =(Task) proxyFactory.getProxy();
    proxy.execute("spring proxyFactory任务");
  }
}
