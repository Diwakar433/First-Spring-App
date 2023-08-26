package com.example.Studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo) {
        return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }


    @GetMapping("/getByPath/{id}")
    public Student getStudentPath(@PathVariable("id") int regNo) {
        return studentService.getStudentPath(regNo);
    }

    @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge) {
        return studentService.updateAge(regNo, newAge);
    }

//    Delete the student details using regNo

    @PutMapping("/delete")
    public String deleteStudent(@RequestParam("q") int regNo) {
        return studentService.deleteStudent(regNo);
    }

//    Delete the Student by path variable
    @PutMapping("/deleteByPath/{id}")
    public String deleteStudentByPath(@PathVariable("id") int regNo) {
        return studentService.deleteStudentByPath(regNo);
    }

//    change the course of student using requestPram and pathVariable
    @PutMapping("/update-course")
    public Student updateCourse(@RequestParam("q") int regNo, @RequestParam("course") String course) {
        return studentService.updateCourse(regNo, course);
    }

//  using path variable

    @PutMapping("/update-course/{id}")
    public Student updateCourseByPath(@PathVariable("id") int regNo, @RequestParam("course") String course) {
        return studentService.updateCourseByPath(regNo, course);
    }

//    change both course and age
    @PutMapping("/update-age-course")
    public Student updateAgeCourse(@RequestParam("q") int regNo, @RequestParam("course") String course, @RequestParam("age") int newAge) {
        return studentService.updateAgeCourse(regNo, course, newAge);
    }

}
