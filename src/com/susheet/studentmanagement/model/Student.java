package com.susheet.studentmanagement.model;

public class Student {
    private Long id; //Should be Final, but final fields require instant value assignment.
    private String name;
    private int age;
    private Department department;
    private Double cgpa;

    //public Student() {} //empty constructor not required as per requirements

    public Student(String name, int age, Double cgpa, Department department) throws IllegalArgumentException
    {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name is invalid.");
        }
        if(age < 18 || age > 60)
        {
            throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
        }
        if(cgpa < 0 || cgpa > 10)
        {
            throw new IllegalArgumentException("CGPA is invalid. CGPA must be between 0-10.");
        }
        if(department == null)
        {
            throw new IllegalArgumentException("Department is mandatory.");
        }
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name is invalid.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if(age < 18 || age > 60)
        {
            throw new IllegalArgumentException("Age is invalid. Age must be between 18-60 years.");
        }
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
