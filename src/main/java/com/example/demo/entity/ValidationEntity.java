package om.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ValidationEntity{
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     @NotNull
     private String username;
     private String email;
     private String password;
     private int age
}