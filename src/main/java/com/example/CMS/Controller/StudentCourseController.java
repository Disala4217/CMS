package com.example.CMS.Controller;

import com.example.CMS.DTO.StudentCourseRequest;
import com.example.CMS.Entity.StudentCourse;
import com.example.CMS.Service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-courses")
public class StudentCourseController {
    @Autowired
    private StudentCourseService studentCourseService;

    @PostMapping("/enroll")
    public ResponseEntity<StudentCourse> enrollStudent(@RequestBody StudentCourseRequest request) {
        System.out.println("Received request to enroll student in course:");
        System.out.println("Course ID: " + request.getCourseId());
        System.out.println("Student ID: " + request.getStudentId());
        System.out.println("Marks: " + request.getMarks());
        System.out.println("Status: " + request.getStatus());
        StudentCourse studentCourse = studentCourseService.enrollStudentInCourse(request);
        return ResponseEntity.ok(studentCourse);
    }

}
