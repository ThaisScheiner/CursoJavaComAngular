package com.aula.dto;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//record:
//classe imultavel
//nao tem construtor vazio
//nao tem metodo setters
//forma de ter dados nas propriedades
//é atraves do construtor
//nao tem o get, é diretamente na propriedade
public record CourseDTO(
    @JsonProperty("_id") Long id, 
    @NotBlank @NotNull @Length(min = 5, max = 100) String name, 
    @NotNull @Length(max = 10) String category) {

}
