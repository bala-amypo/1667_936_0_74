package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;

public interface ValidationService{
      ValidationEntity postdata(ValidationEntity user);
      ValidationEntity getData(long id);
}