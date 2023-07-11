package com.example.StubServer.controller;

import com.example.StubServer.model.CourseModel;
import com.example.StubServer.service.ICourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    final ICourseService courseService;

    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = "/all")
    public List<CourseModel> getAllCourses() {
        return courseService.getAllCourses();
    };
}
