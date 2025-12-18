package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ValidationController{
  @Autowired ValidationService validation;
    @PostMapping("/postval")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
        return validation.postdata(val);
    }
}