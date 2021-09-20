/* UserData Model */
package com.bridgelabz.bookstoreapp.entity;

import com.bridgelabz.bookstoreapp.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@Entity
@Table(name = "USER_DETAILS")
public @Data class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, length = 20)
    private String firstName;
    @Column(nullable = false, length = 20)
    private String lastName;
    private LocalDate dob;
    @Column(nullable = false, length = 12)
    private String kyc;
    @Column(nullable = false, unique = true)
    private String emailId;
    @Column(nullable = false, length = 64)
    private String password;
    private LocalDate registeredDate;
    private LocalDate updatedDate;

    public UserData() {}

    public UserData(UserDTO userDTO) { this.updateUser(userDTO); }

    public void updateUser(UserDTO userDTO) {
        this.firstName = userDTO.firstName;
        this.lastName = userDTO.lastName;
        this.kyc = userDTO.kyc;
        this.dob = userDTO.dob;
        this.emailId = userDTO.emailId;
        this.password = userDTO.password;
        this.registeredDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }
}
