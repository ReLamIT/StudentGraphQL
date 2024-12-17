package com.controle.controle.service.manager;


import com.controle.controle.dao.entities.Student;
import com.controle.controle.dao.repositories.StudentRepository;
import com.controle.controle.dto.StudentDTO;
import com.controle.controle.mapper.StudentMapper;
import com.controle.controle.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(String dateNaissance) {
        List<StudentDTO> studentDTOS = new ArrayList<>();
        List<Student> students = studentRepository.findStudentsByDateNaissance(dateNaissance);
        for(Student student : students){
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentDTOS;
    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return studentMapper.fromStudentToStudentDTO(studentRepository.save(studentMapper.fromStudentDTOtoStudent(studentDTO)));
    }
}
