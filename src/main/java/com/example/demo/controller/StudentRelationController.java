package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentRelationService;

@RestController
public class StudentRelationController{
     @Autowired StudentRelationService stamp;

    @PostMapping("/post3")
    public Student sendData(@RequestBody Student sta){
        return stamp.toPost(sta);
    }
} 