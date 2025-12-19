package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStamp;
import com.example.demo.repository.TimeStampRepository;

@Service
public class TimeStampServiceImpl implements TimeStampService{
   @Autowired TimeStampRepository t;
   @Override
   public TimeStamp add(TimeStamp s){
    return t.save(s);
   }
}
