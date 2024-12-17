package com.controle.controle.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentDTO {

    private String name;

    private String email;

    private String dateNaissance;
}
