package com.openapi.com.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openapi.com.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
      public Student findByEmail(String email);
}
