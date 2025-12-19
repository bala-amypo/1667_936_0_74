package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updated;
    
    LocalDateTime now = LocalDateTime.now();
    @PrePersist
    public void onCreate(){
         this.createAt = now;
         this.updated = now; 
    }
    @PreUpdate
    public void onUpdate(){
        this.updated = now;
    }
}