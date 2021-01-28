package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory, between 8 and 60 characters")
    private String password;

    @NotBlank(message = "FullName is mandatory")
    private String fullname;

    @NotBlank(message = "Role is mandatory")
    private String role;

    public User(@NotBlank(message = "Username is mandatory") String username, @NotBlank(message = "Password is mandatory") String password, @NotBlank(message = "FullName is mandatory") String fullname, @NotBlank(message = "Role is mandatory") String role) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.role = role;
    }

}
