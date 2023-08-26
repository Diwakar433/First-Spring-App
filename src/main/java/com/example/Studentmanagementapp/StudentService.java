package com.example.Studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo) {
        return studentRepository.getStudent(regNo);
    }

    public String addStudent(Student student) {
        studentRepository.addStudent(student);
        return "Student has been added Successfully.";
    }

    public Student getStudentPath(int regNo) {
        return studentRepository.getStudentPath(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        return studentRepository.updateAge(regNo, newAge);
    }

    public String deleteStudent(int regNo) {
        studentRepository.deleteStudent(regNo);
        return "Student has been Deleted successfully.";
    }

    public String deleteStudentByPath(int regNo) {
        studentRepository.deleteStudentByPath(regNo);
        return "Student has been Deleted successfully using path.";
    }

    public Student updateCourse(int regNo, String course) {
        return studentRepository.updateCourse(regNo, course);
    }

    public Student updateCourseByPath(int regNo, String course) {
        return studentRepository.updateCourseByPath(regNo, course);
    }

    public Student updateAgeCourse(int regNo, String course, int newAge) {
        return studentRepository.updateAgeCourse(regNo, course, newAge);
    }
}
