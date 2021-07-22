package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

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
    private Integer id;
    @NotEmpty(message = "Username is mandatory")
    private String username;
    @NotEmpty(message = "Password is mandatory")
    private String password;
    @NotEmpty(message = "FullName is mandatory")
    private String fullname;
    @NotEmpty(message = "Role is mandatory")
    private String role;

	
//	
//	@Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//	    @Column(name = "user_id")
//	    private int id;
//	    @Column(name = "email")
//	    @Email(message = "*Please provide a valid Email")
//	    @NotEmpty(message = "*Please provide an email")
//	    private String email;
//	    @Column(name = "password")
//	    @Length(min = 5, message = "*Your password must have at least 5 characters")
//	    @NotEmpty(message = "*Please provide your password")
//	    private String password;
//	    @Column(name = "name")
//	    @NotEmpty(message = "*Please provide your name")
//	    private String name;
//	    @Column(name = "last_name")
//	    @NotEmpty(message = "*Please provide your last name")
//	    private String lastName;
//	    @Column(name = "active")
//	    private int active;
//	    @ManyToMany(cascade = CascadeType.ALL)
//	    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//	    private Set<Role> roles;


}
