package model;

public class Student {
    private Integer id;
    private String name;
    private int age;
    private String department;
    private int CGPA;

    public Student() {} //empty constructor

    public Student(String name, int age, int CGPA, String department) {
        this.name = name;
        this.age = age;
        this.CGPA = CGPA;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCGPA() {
        return CGPA;
    }

    public void setCGPA(int CGPA) {
        this.CGPA = CGPA;
    }
}
