package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.VaslidationEntity;
import com.example.demo.service.ValidationRepository;


@Service
public class ValidationServiceImpl implements ValidationService{

  @Autowired ValidationRepository validation;
  @Override
  public ValidationEntity postdata(ValidationEntity val){
       return validation.save(val);
    }
}