package com.susheet.studentmanagement.service;

import com.susheet.studentmanagement.exception.StudentNotFoundException;
import com.susheet.studentmanagement.model.CreateStudentRequest;
import com.susheet.studentmanagement.model.Department;
import com.susheet.studentmanagement.model.Student;
import com.susheet.studentmanagement.model.UpdateStudentRequest;
import com.susheet.studentmanagement.repository.StudentRepo;
import com.susheet.studentmanagement.repository.StudentRepository;
import com.susheet.studentmanagement.util.StudentIdGenerator;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) //Constructor injection
    {
        this.studentRepository = studentRepository;
    }

    public void addStudent(CreateStudentRequest createStudentRequest)
    {
        Long id = StudentIdGenerator.generateId();
        Student student = new Student(id, createStudentRequest.getName(), createStudentRequest.getAge(), createStudentRequest.getCgpa(), createStudentRequest.getDepartment());
        //Add validations first.
        studentRepository.save(student);
    }

    public void removeStudent(Long id)
    {
        //No validations required. if id is present entry will be removed, else changes take place
        studentRepository.deleteById(id);
    }

    public void updateStudent(Long id, UpdateStudentRequest updateStudentRequest) throws StudentNotFoundException, IllegalArgumentException
    {
        if(id == null)throw new IllegalArgumentException("Id cannot be empty.");
        if(updateStudentRequest == null)throw new IllegalArgumentException("Invalid update request. No values to be updated.");

        Student student = studentRepository.findById(id).orElseThrow(() ->
                new StudentNotFoundException("Student with id: " + id + " not present in the system"));

        if(updateStudentRequest.getName() != null)
        {
            student.setName(updateStudentRequest.getName());
        }

        if(updateStudentRequest.getAge() != null)
        {
            student.setAge(updateStudentRequest.getAge());
        }

        if(updateStudentRequest.getDepartment() != null)
        {
            student.setDepartment(updateStudentRequest.getDepartment());
        }

        if(updateStudentRequest.getCgpa() != null)
        {
            student.setCgpa(updateStudentRequest.getCgpa());
        }
    }
}
