package com.susheet.studentmanagement.model;

public class UpdateStudentRequest {

    private String name;
    private Integer age;
    private Department department;
    private Double cgpa;

    public UpdateStudentRequest(String name, Integer age, Double cgpa, Department department)
    {
        setName(name);
        setAge(age);
        setCgpa(cgpa);
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
        {
            return;
        }
        if(!isNameValid(name))
        {
            throw new IllegalArgumentException("Name to be updated must be 1-50 characters long.");
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age == null)
        {
            return;
        }
        if(!isAgeValid(age))
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
            return; //optional field in update request
//            throw new IllegalArgumentException("Department cannot be empty.");
        }
        this.department = department;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        if(cgpa == null)
        {
            return;
        }
        if(!isCgpaValid(cgpa))
        {
            throw new IllegalArgumentException("CGPA is invalid. CGPA must be between 0-10.");
        }

        this.cgpa = cgpa;
    }

    //validation methods. "private static" as these methods are independent of object's state.
    private static boolean isNameValid(String name)
    {
        return name.length() >= AppConstants.MIN_NAME_LEN && name.length() <= AppConstants.MAX_NAME_LEN;
    }
    private static boolean isAgeValid(Integer age)
    {
        return age >= AppConstants.MIN_AGE && age <= AppConstants.MAX_AGE;
    }
    private static boolean isCgpaValid(Double cgpa)
    {
        return cgpa >= AppConstants.MIN_CGPA && cgpa <= AppConstants.MAX_CGPA;
    }
}
