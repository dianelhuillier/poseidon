package com.nnk.springboot.domain;

import javax.annotation.RegEx;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

//import com.nnk.springboot.ValidPassword;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "id")
    private Integer id;
    @NotEmpty(message = "Username is mandatory")
    @Column (name = "username")
    private String username;
    @NotEmpty(message = "Password is mandatory")
    @Column(name ="password")
    @Pattern(regexp="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message ="Your password must contain 8-15 characters, one uppercase, one lowercase, one number and one special character")
    private String password;
    @NotEmpty(message = "FullName is mandatory")
    @Column(name = "fullname")
    private String fullname;
    @NotEmpty(message = "Role is mandatory")
    @Column(name ="role")
    private String role;

	

}
