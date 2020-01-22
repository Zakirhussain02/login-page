package com.shaadi.userauthenticationservice.message.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//credentials to check if the userDTO is authorized to request for services.

public class Login {

    @NotBlank
    @Size(min=3,max=60)
    private String email;

    @NotBlank
    @Size(min=6,max = 64)
    private String password;

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }


}
