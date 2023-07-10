package com.example.StubServer.controller;

import com.example.StubServer.model.UserModel;
import com.example.StubServer.service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public List<UserModel> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
