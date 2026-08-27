package com.susheet.studentmanagement.model;

import java.util.Objects;

public class Student {
    //using StudentIdGenerator.generateId() here is bad design, causes coupling and the entity itself decides something it should not
    private final Long id; //Should be Final, but final fields require instant value assignment.
    private String name;
    private int age;
    private Department department;
    private Double cgpa;

    //Validation constants
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 60;
    private static final double MIN_CGPA = 0;
    private static final double MAX_CGPA = 10;

    //public Student() {} //empty constructor not required as per requirements

    public Student(Long id, String name, int age, double cgpa, Department department) //without "throws" as IllegalArgumentException is Unchecked exception
    {
        this.id = id;
//        if(name == null || name.isBlank())
//        {
//            throw new IllegalArgumentException("Name is invalid.");
//        }
//        if(age < MIN_AGE || age > MAX_AGE)
//        {
//            throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
//        }
//        if(cgpa < MIN_CGPA || cgpa > MAX_CGPA)
//        {
//            throw new IllegalArgumentException("CGPA is invalid. CGPA must be between 0-10.");
//        }
//        if(department == null)
//        {
//            throw new IllegalArgumentException("Department is mandatory.");
//        }
//        this.name = name;
//        this.age = age;
//        this.cgpa = cgpa;
//        this.department = department;
        //using SETTERS to initialize the values and Setters contain the validations.
        //Hence, we have centralized validation logic.
        setName(name);
        setAge(age);
        setCgpa(cgpa);
        setDepartment(department);
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name is invalid.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < MIN_AGE || age > MAX_AGE)
        {
            throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
        }
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if(department == null) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        this.department = department;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if(cgpa < MIN_CGPA || cgpa > MAX_CGPA)
        {
            throw new IllegalArgumentException("CGPA is invalid. CGPA must be between 0-10.");
        }
        this.cgpa = cgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(id, student.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
