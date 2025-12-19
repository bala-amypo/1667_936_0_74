package com.example.demo.repository;

import com.example.demo.entity.Identity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IdentityRepository extends JpaRepository<Identity,Integer>{

}