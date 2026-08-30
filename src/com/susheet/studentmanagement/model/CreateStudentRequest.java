package com.susheet.studentmanagement.model;


public class CreateStudentRequest {
    private final String name;
    private final int age;
    private final Department department;
    private final double cgpa;

    public CreateStudentRequest(String name, int age, Department department, double cgpa) {

        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name is invalid.");
        }
        if(age < AppConstants.MIN_AGE || age > AppConstants.MAX_AGE)
        {
            throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
        }
        if(department == null) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        if(cgpa < AppConstants.MIN_CGPA || cgpa > AppConstants.MAX_CGPA)
        {
            throw new IllegalArgumentException("CGPA is invalid. CGPA must be between 0-10.");
        }

        this.name = name;
        this.age = age;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name)
//    {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public Department getDepartment() {
        return department;
    }

//    public void setDepartment(Department department) {
//        this.department = department;
//    }

    public double getCgpa() {
        return cgpa;
    }

//    public void setCgpa(Double cgpa) {
//        this.cgpa = cgpa;
//    }
}
