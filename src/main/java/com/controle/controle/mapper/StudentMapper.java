package com.controle.controle.mapper;


import com.controle.controle.dao.entities.Student;
import com.controle.controle.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    ModelMapper modelMapper = new ModelMapper();

    public StudentDTO fromStudentToStudentDTO(Student student){
        return modelMapper.map(student,StudentDTO.class);
    }


    public Student fromStudentDTOtoStudent(StudentDTO studentDTO){
        return modelMapper.map(studentDTO,Student.class);
    }
}
