package com.hellojd.demo.spring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hellojd.demo.EchoTask;
import com.hellojd.demo.Task;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class AopApplicationContextTest {
  @Resource
  Task taskProxy;
  @Resource
  EchoTask echoTask;

  @Test
  public void test1() {
    taskProxy.execute("proxy任务");
    echoTask.execute("原生任务");
  }
}
