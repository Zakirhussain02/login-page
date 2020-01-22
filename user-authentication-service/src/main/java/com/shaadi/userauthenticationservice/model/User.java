package com.shaadi.userauthenticationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;

//credentials present in mysql database with  table named users.
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "email"
        }),
        @UniqueConstraint(columnNames = {
                "password"
        })
})

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

//userDTO object having email and password.
public class User {

    @Id
    @Email
    private String email;
    private String password;
}
