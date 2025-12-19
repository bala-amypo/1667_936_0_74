package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;

@RestController
public class TimeStampController{
     @Autowired TimeStampService ser;

    @PostMapping("/post1")
    public TimeStamp sendData(@RequestBody TimeStamp stu){
        return ser.add(stu);
    }
} 