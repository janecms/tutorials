package com.hellojd.demo.cglib;

import java.lang.reflect.Method;

import com.hellojd.demo.EchoTask;

import lombok.extern.slf4j.Slf4j;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class CglibProxyTest {

  public static <T> T ceateProxtObject(final T targetObj, Class<T> clazz) {
    // 声明增加类实例
    Enhancer en = new Enhancer();
    // 设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
    en.setSuperclass(clazz);
    // 设置回调函数，即一个方法拦截
    en.setCallback(new MethodInterceptor() {

      @Override
      public Object intercept(Object obj, Method method, Object[] args,
          MethodProxy methodProxy) throws Throwable {
        log.info("cglib 准备执行任务");
        // 注意参数object,仍然为外部声明的源对象，且Method为JDK的Method反射
        Object o = method.invoke(targetObj, args);
        log.info("cglib 执行任务完成");
        return o;
      }
    });
    return (T) en.create();
  }

  public static void main(String[] args) {
    EchoTask echoTask = ceateProxtObject(new EchoTask(), EchoTask.class);
    echoTask.execute("cglib任务");
  }
}
