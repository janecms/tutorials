package com.hellojd.demo.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hellojd.demo.Task;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext_2.xml"})
public class AopAspectConfigApplicationContextTest {
  @Autowired
  Task echoTask;

  @Test
  public void test1() {
    echoTask.execute("echo任务");
  }
}
