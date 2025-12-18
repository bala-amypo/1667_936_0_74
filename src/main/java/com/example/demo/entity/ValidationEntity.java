package om.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Max;

@Entity
public class ValidationEntity{
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     @NotNull
     @Size(min = 2,max = 10,message="must be 2 to 10 character")
     private String username;
     @Email
     private String email;
     @Size(min=6,max=8,message="Must be between 6 to 8 character") 
     @NotNull(message="Password Mandatory")
     private String password;
     @Max(30)
     @NotNull
     @Positive(message="Age should be a positive number")
     private int age
}