package com.hellojd.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.hellojd.demo.EchoTask;
import com.hellojd.demo.Task;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class ProxyTest {
  public static void main(String[] args) {
    EchoTask echoTask = new EchoTask();
    Object proxy =Proxy.newProxyInstance(echoTask.getClass().getClassLoader(), new Class[]{Task.class}, new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("开始准备执行任务");
        echoTask.execute((String)args[0]);
        log.info("执行任务结束");
        return null;
      }
    });
    Task task =(Task)proxy;
    task.execute("动态代理任务");
  }
}
