package com.sms.StudentManagementSystem.repo;

import com.sms.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(value = "SELECT * FROM Student WHERE id=?1", nativeQuery = true)
    Student findStudentById(Long id);
}
