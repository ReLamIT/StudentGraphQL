package com.controle.controle;


import com.controle.controle.dao.entities.Student;
import com.controle.controle.dao.repositories.StudentRepository;
import com.controle.controle.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;

@SpringBootApplication
public class ControleApplication implements CommandLineRunner {


	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Student> studentList = List.of(
				Student.builder().name("reda").email("reda@gmail.com").dateNaissance("11/12/2002").build(),
				Student.builder().name("xxx").email("xxx@gmail.com").dateNaissance("11/12/2001").build(),
				Student.builder().name("aaa").email("aaa@gmail.com").dateNaissance("11/12/2004").build(),
				Student.builder().name("bbb").email("bbb@gmail.com").dateNaissance("11/12/2005").build()
				);
		studentRepository.saveAll(studentList);
	}
}
