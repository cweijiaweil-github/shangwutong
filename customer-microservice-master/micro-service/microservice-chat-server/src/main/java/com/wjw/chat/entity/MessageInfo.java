package com.wjw.chat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageInfo { 
  //源客户端id 
  private String sourceClientId; 
  //目标客户端id 
  private String targetClientId; 
  //消息类型 
  private String msgType; 
  //消息内容 
  private String msgContent; 
    
} 