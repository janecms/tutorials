package com.hellojd.twophase;

import lombok.Data;

/**
 * @author:zhaoguoyu
 * @date:2018/8/6
 */
@Data
public class AlarmInfo {
  String id;
  AlarmType type;

  public AlarmInfo(String id, AlarmType type) {
    this.id = id;
    this.type = type;
  }

  String extraInfo;
}
