package com.example.demo.repository;

import com.example.demo.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IStudentRepository extends JpaRepository<StudentModel, Long> {
    @Query("Select s from StudentModel s where s.email=?1")
    Optional<StudentModel> findByEmail(String email);

    Optional<StudentModel> findStudentByEmail(String email);
}
