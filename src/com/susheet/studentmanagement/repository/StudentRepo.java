package com.susheet.studentmanagement.repository;

import com.susheet.studentmanagement.model.Student;

import java.util.*;


public class StudentRepo implements StudentRepository{
    private final Map<Long, Student>students = new HashMap<>();
    //final as the students should be pointing to one single map throughout the application.

    @Override
    public void save(Student student) {
        Long studentId = student.getId();
        students.put(studentId, student);
    }

    @Override
    public Optional<Student> findById(Long id)
    {
        return Optional.ofNullable(students.get(id));
    }

    @Override
    public void deleteById(Long id)
    {
        //Directly accesses the entry in map if present. If not, nothing happens. No need to fetch first and then delete.
        students.remove(id);
    }

    @Override
    public List<Student> findAll()
    {
        List<Student> studentList = new ArrayList<>();

        for(Map.Entry<Long, Student> entry: students.entrySet())
        {
            studentList.add(entry.getValue());
        }

        return studentList;

//        //Alternatively
//        return new ArrayList<>(students.values());
    }
}
