package com.example.Studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer, Student> db = new HashMap<>();
    public Student getStudent(int regNo) {
        return db.get(regNo);
    }

    public void addStudent(Student student) {
        db.put(student.getRegNo(), student);
        return;
    }

    public Student getStudentPath(int regNo) {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public void deleteStudent(int regNo) {
        db.remove(regNo);
        return;
    }

    public void deleteStudentByPath(int regNo) {
        db.remove(regNo);
        return;
    }

    public Student updateCourse(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    public Student updateCourseByPath(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    public Student updateAgeCourse(int regNo, String course, int newAge) {
        db.get(regNo).setCourse(course);
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }
}
