package com.example.demo.service.Impl;

import com.example.demo.service.StudentRelationService;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRelationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentRelationServiceImpl implements StudentRelationService{
    @Autowired StudentRelationRepository student;
    @Override
    public Student toPost(Student stu){
       return student.save(stu);
    }
}