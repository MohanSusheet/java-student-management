package com.susheet.studentmanagement.service;

import com.susheet.studentmanagement.exception.StudentNotFoundException;
import com.susheet.studentmanagement.model.Department;
import com.susheet.studentmanagement.model.Student;
import com.susheet.studentmanagement.repository.StudentRepo;
import com.susheet.studentmanagement.repository.StudentRepository;

import java.util.Optional;

public class StudentService {

    StudentRepository _studentRepository = new StudentRepo();

    public void addStudent(Student student)
    {
        //Add validations first.
        _studentRepository.save(student);
    }

    public void removeStudent(Long id)
    {
        //Add validations first.
        _studentRepository.deleteById(id);
    }

    public void updateStudent(Long id, String name, int age, Department department, Double CGPA) throws StudentNotFoundException
    {
        Optional<Student> studentOptional = _studentRepository.findById(id);

        if(studentOptional.isPresent())
        {
            Student student = studentOptional.get();

            if(name != null && !name.isBlank())
            {
                student.setName(name);
            }

            if(age >= 18 && age <= 60)
            {
                student.setName(name);
            }
        }
        else
        {
            throw new StudentNotFoundException("Student with id: " + id + " not found in the system.");
        }
    }
}
