package com.example.StubServer.service;

import com.example.StubServer.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class UserService implements IUserService{
    @Override
    public List<UserModel> getAllUser() {
        return LongStream
                .range(0,100)
                .mapToObj(val -> new UserModel(val, "Test user" + val, "QA" + val, "test@" + val + "test.test", 23, 78))
                .collect(Collectors.toList());
    }

    @Override
    public UserModel getUserById(Long id) {
        return new UserModel(id, "Test user", "QA", "test@test.test", 23, 78);
    }
}
