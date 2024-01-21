package com.example.securitymasterdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.security.core.parameters.P;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "FirstName cannnot be empty!")
    @Pattern(regexp = "[A-Za-z-']*",
    message = "FirstName cannot contain illegal characters.")
    private String firstName;
    @NotBlank(message = "lastName cannnot be empty!")
    @Pattern(regexp = "[A-Za-z-']*",
            message = "lastName cannot contain illegal characters.")
    private String lastName;
    @NotBlank(message = "PhoneNumber cannot be empty!")
    @Pattern(regexp = "[0-9\\-+]*",message = "Phone number cannot contain illegal characters.")
    private String phoneNumber;

    @NotBlank
    @Pattern(regexp = "[\\w .\\-/,]*",message = "Address cannot contain illegal characters.")
    private String address;
    @NotBlank
    @Pattern(regexp = "[A-Za-z0-9\\-]*",message = "CubicleNo")
    private String cubicleNo;
}
