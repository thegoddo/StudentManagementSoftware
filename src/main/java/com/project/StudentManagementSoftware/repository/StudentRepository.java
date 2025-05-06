package com.project.StudentManagementSoftware.repository;

import com.project.StudentManagementSoftware.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
