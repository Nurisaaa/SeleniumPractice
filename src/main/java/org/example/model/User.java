package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String userFullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;
}
