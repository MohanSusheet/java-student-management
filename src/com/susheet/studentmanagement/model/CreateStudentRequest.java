package com.susheet.studentmanagement.model;

import com.susheet.studentmanagement.util.StudentIdGenerator;

public class CreateStudentRequest {
    private String name;
    private int age;
    private Department department;
    private Double cgpa;

    public CreateStudentRequest(String name, int age, Department department, Double cgpa) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
}
