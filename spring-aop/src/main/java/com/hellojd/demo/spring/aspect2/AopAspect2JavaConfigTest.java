package com.hellojd.demo.spring.aspect2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hellojd.demo.EchoTask;
import com.hellojd.demo.Task;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
public class AopAspect2JavaConfigTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAspectApp.class);
    Task echoTask = (Task)context.getBean("echoTask");
    echoTask.execute("aspect2JavaConfig");
  }
}
