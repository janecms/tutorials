package com.hellojd.demo.spring;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class PlainLogAspect {
  public void before() {
    log.info("LogAspect 准备执行任务");
  }
  public void after() {
    log.info("LogAspect 执行任务完成");
  }
}
