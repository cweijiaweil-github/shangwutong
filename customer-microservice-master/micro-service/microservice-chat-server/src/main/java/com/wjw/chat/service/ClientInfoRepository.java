package com.wjw.chat.service;

import com.wjw.chat.entity.ClientInfo;

import org.springframework.data.repository.CrudRepository;
  
  
public interface ClientInfoRepository extends CrudRepository<ClientInfo, String>{ 
  ClientInfo findClientByclientid(String clientId); 
} 