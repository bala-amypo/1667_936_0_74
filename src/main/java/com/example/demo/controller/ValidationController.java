package com.example.demo.controller;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

@RestController
public class ValidationController{
  @Autowired ValidationService validation;
    @PostMapping("/postval")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
        return validation.postdata(val);
    }

    @GetMapping("/getbyid/{id}")
    public ValidationEntity getdataid(@PathVariable long id){
        return validation.getData(id);
    }
}