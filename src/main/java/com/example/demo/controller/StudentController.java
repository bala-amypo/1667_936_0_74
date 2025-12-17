package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;



@RestController
public class controller{
    @Autowired StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity s){
        return ser.postdata(s);
    }
}