package com.example.StubServer.controller;

import com.example.StubServer.model.CourseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@RestController
@RequestMapping("/course")
public class CourseController {
    @GetMapping("/all")
    public List<CourseModel> getAllCourse() {
        return LongStream
                .range(0, 100)
                .mapToObj(val -> new CourseModel("Name" + val, new Random().nextInt(10000)))
                .collect(Collectors.toList());
    }
}
