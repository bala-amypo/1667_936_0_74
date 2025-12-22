package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Identity;
import com.example.demo.service.IdentityService;

@RestController
public class IdentityController{
     @Autowired IdentityService stamp;

    @PostMapping("/post2")
    public Identity sendData(@RequestBody Identity sta){
        return stamp.toPostAt(sta);
    }
} 