package com.controle.controle.dao.repositories;

import com.controle.controle.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findStudentsByDateNaissance(String dateNaissance);
}
