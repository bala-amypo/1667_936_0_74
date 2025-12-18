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

    public void setId(Long id){
        this.id = id;
     }

     public Long getId(){
        return id;
     }

     public String getUsername(){
        return username;
     }

     public void setUsername(String username){
        this.username= username;
     }
     public String getEmail(){
        return email;
     }
     
     public void setEmail(String email){
        this.email=email;
     }

     public String getPassword(){
        return password;
     }
     
     public void setPassword(String password){
        this.password = password;
     }

     public int getAge(){
     return age;
     }

     public void setAge(int age){
     this.age= age;
     }

     public ValidationEntity(Long id,@NotNull @Size(min = 2,max = 10,message="must be 2 to 10 character") String username
        @Email String email
        @Size(min=6,max=8,message="Must be between 6 to 8 character") @NotNull(message="Password Mandatory") String Password
        @Max(30) @NotNull @Positive(message="Age should be a positive number") int age){
        this.id = id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
     }

     public ValidationEntity(){
     }
}