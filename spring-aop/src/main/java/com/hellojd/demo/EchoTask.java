package com.hellojd.demo;

import com.hellojd.demo.Task;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Slf4j
public class EchoTask implements Task {
  @Override
  public void execute(String taskName) {
      log.info("run :{}" ,taskName);
  }
}
