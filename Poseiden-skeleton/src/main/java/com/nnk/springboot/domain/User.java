package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    @NotBlank(message = "Username is mandatory")
    @Size(max = 125)
    private String username;

    @Column(name = "password")
    @NotBlank(message = "Password is mandatory")
    @Size(max = 125)
    private String password;

    @Column(name = "fullname")
    @NotBlank(message = "FullName is mandatory")
    @Size(max = 125)
    private String fullName;

    @Column(name = "role")
    @NotBlank(message = "Role is mandatory")
    @Size(max = 125)
    private String role;


}
