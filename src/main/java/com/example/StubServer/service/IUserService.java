package com.example.StubServer.service;

import com.example.StubServer.model.UserModel;

import java.util.List;

public interface IUserService {
    List<UserModel> getAllUser();
    UserModel getUserById(Long id);
}
