package com.susheet.studentmanagement.repository;

import com.susheet.studentmanagement.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    void save(Student student);
    Optional<Student> findById(Long id);
    List<Student> findAll();
    void deleteById(Long id);
}
