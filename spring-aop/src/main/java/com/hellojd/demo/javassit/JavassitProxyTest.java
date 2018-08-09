package com.hellojd.demo.javassit;

import java.lang.reflect.Method;

import com.hellojd.demo.EchoTask;

import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class JavassitProxyTest {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    ProxyFactory f = new ProxyFactory();
    f.setSuperclass(EchoTask.class);
    f.setFilter(new MethodFilter() {
      @Override
      public boolean isHandled(Method m) {
        // ignore finalize()
        return !m.getName().equals("finalize");
      }
    });
    Class c = f.createClass();
    MethodHandler mi = new MethodHandler() {
      @Override
      public Object invoke(Object self, Method m, Method proceed,
          Object[] args) throws Throwable {
        log.info("javassit 开始准备执行任务");
        Object result = proceed.invoke(self, args);
        log.info("javassit 执行任务完成");
        return result;  // execute the original method.
      }
    };
    EchoTask task = (EchoTask)c.newInstance();
    ((ProxyObject)task).setHandler(mi);
    task.execute("javassit Task");
  }
}
