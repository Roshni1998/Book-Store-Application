package com.bridgelabz.bookstoreapp.dto;

import lombok.Getter;
import java.time.LocalDate;

@Getter
public class UserDTO {

    private int id;

    private String firstName;
    private String lastName;
    //kyc
    private LocalDate dob;
    private LocalDate registeredDate;
    private LocalDate updatedDate;
    private String password;
    private String emailId;
    // Boolean Verify
    // OTP


}
