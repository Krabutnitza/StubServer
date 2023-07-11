package com.example.StubServer.service;

import com.example.StubServer.model.CourseModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements ICourseService {
    CourseModel course1 = new CourseModel("QA java", 15000);
    CourseModel course2 = new CourseModel("java", 12000);

    @Override
    public List<CourseModel> getAllCourses() {
        ArrayList<CourseModel> allCourses = new ArrayList<CourseModel>();
        allCourses.add(course1);
        allCourses.add(course2);

        return allCourses;
    }
}
