package com.shaadi.userauthenticationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class UserDTO {
    /*
     * Assigning the primary key
     */

    @Id
    private String email;
    private String password;
    private Long mobileNumber;
    private String firstName;
    private String lastName;
}
