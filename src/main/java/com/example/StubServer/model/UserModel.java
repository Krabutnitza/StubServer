package com.example.StubServer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserModel {
    private Long userId;
    private String name;
    private String course;
    private String email;
    private Integer age;
}
