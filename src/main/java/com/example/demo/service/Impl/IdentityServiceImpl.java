package com.example.demo.service.Impl;

import com.example.demo.service.IdentityService;
import com.example.demo.entity.Identity;
import com.example.demo.repository.IdentityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityServiceImpl implements IdentityService{
    @Autowired IdentityRepository ident;
    @Override
    public Identity toPostAt(Identity stu){
       return ident.save(stu);
    }
}