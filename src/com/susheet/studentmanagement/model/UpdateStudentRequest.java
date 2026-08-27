package com.susheet.studentmanagement.model;

public class UpdateStudentRequest {

    private String name;
    private Integer age;
    private Department department;
    private Double cgpa;

    private static final int MIN_NAME_LEN = 2;
    private static final int MAX_NAME_LEN = 50;
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 60;
    private static final double MIN_CGPA = 0;
    private static final double MAX_CGPA = 10;

    public UpdateStudentRequest(String name, Integer age, Double cgpa, Department department)
    {
        //Validations
        if(name != null)
        {
            if(!validateName(name)) throw new IllegalArgumentException("Name to be update must be 1-50 characters long.");
        }
        if(age != null)
        {
            if(!validateAge(age)) throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
        }
        if(cgpa != null)
        {
            if(!validateCgpa(cgpa)) throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
        }
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    //validation methods.
    public boolean validateName(String name)
    {
        return name.length() < MIN_NAME_LEN || name.length() > MAX_NAME_LEN;
    }
    public boolean validateAge(Integer age)
    {
        return age < MIN_AGE || age > MAX_AGE;
    }
    public boolean validateCgpa(Double cgpa)
    {
        return cgpa < MIN_CGPA || cgpa > MAX_CGPA;
    }
}
