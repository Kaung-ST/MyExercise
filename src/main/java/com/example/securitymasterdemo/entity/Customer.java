package com.example.securitymasterdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @NotBlank(message = "Code cannot be Empty")
    @Size(min=2,max = 5,message = "Code must be between 2 and 5.")
    @Pattern(regexp = "[A-Za-z]*",message = "Code cannot contain illeagal characters")
    private  String code;

    @NotBlank(message = "Name cannot be Empty")
    @Pattern(regexp = "[A-Za-z]*",message = "First Name cannot contain illegal characters.")
    private String firstName;

    @NotBlank(message = "Name cannot be Empty")
    @Pattern(regexp = "[A-Za-z]*",message = "First Name cannot contain illegal characters.")
    private String lastName;
    @NotBlank(message = "Address cannot be blank")
    @Pattern(regexp = "[\\w.\\-/,]*")
    private String address;
}
