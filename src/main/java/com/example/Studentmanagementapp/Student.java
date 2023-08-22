package com.example.Studentmanagementapp;

public class Student {

    private int regNo;
    private String name;
    private int age;

    private String course;

    public Student() {
    }

    public Student(int regNo, String name, int age, String course) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
