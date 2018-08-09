package com.hellojd.demo.spring.aspect2;

import org.springframework.stereotype.Service;

import com.hellojd.demo.Task;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:zhaoguoyu
 * @date:2018/8/9
 */
@Service("echoTask")
@Slf4j
public class EchoTask2 implements Task {
  @Override
  public void execute(String taskName) {
      log.info("run :{}" ,taskName);
  }
}
