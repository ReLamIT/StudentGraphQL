package com.controle.controle.web;

import com.controle.controle.dto.StudentDTO;
import com.controle.controle.service.manager.StudentManager;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {

    private StudentManager studentManager;


    @MutationMapping
    public StudentDTO saveStudent(@Argument("student") StudentDTO studentDTO){
        return studentManager.saveStudent(studentDTO);
    }


    @QueryMapping
    public List<StudentDTO> getStudentsByDateNaissance(@Argument String dateNaissance){
        return studentManager.getStudentsByDateNaissance(dateNaissance);
    }
}
