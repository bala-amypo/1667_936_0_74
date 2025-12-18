package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.VaslidationEntity;
import com.example.demo.service.ValidationService;


@Service
public class ValidationServiceImpl implements ValidationService{

  @Autowired  student;
    @Override
    public StudentEntity postdata(StudentEntity stu){
       return student.save(stu);
    }
}