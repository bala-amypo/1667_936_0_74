package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class controller{
    @Autowired StudentService ser;

    @PostMapping("/post")
    public StudentEntity senddd(@RequestBody StudentEntity)
}