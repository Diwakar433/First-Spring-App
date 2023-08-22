package com.example.Studentmanagementapp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer, Student> db = new HashMap<>();

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo) {
        return db.get(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        db.put(student.getRegNo(), student);
        return "Student has been added Successfully.";
    }


    @GetMapping("/getByPath/{id}")
    public Student getStudentPath(@PathVariable("id") int regNo) {
        return db.get(regNo);
    }

    @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

//    Delete the student details using regNo

    @PutMapping("/delete")
    public String deleteStudent(@RequestParam("q") int regNo) {
        db.remove(regNo);
        return "Student has been Deleted successfully.";
    }

//    Delete the Student by path variable
    @PutMapping("/deleteByPath/{id}")
    public String deleteStudentByPath(@PathVariable("id") int regNo) {
        db.remove(regNo);
        return "Student has been Deleted successfully using path.";
    }

//    change the course of student using requestPram and pathVariable
    @PutMapping("/update-course")
    public Student updateCourse(@RequestParam("q") int regNo, @RequestParam("course") String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

//  using path variable

    @PutMapping("/update-course/{id}")
    public Student updateCourseByPath(@PathVariable("id") int regNo, @RequestParam("course") String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

//    change both course and age
    @PutMapping("/update-age-course")
    public Student updateAgeCourse(@RequestParam("q") int regNo, @RequestParam("course") String course, @RequestParam("age") int newAge) {
        db.get(regNo).setCourse(course);
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

}
