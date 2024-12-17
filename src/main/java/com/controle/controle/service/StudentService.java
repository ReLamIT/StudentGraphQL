package com.controle.controle.service;

import com.controle.controle.dao.entities.Student;
import com.controle.controle.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    public List<StudentDTO> getStudentsByDateNaissance(String dateNaissance);

    public StudentDTO saveStudent(StudentDTO studentDTO);
}
