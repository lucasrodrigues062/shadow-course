package br.com.symbiosyssolucoes.shadow.domain.model.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;


public class CreateDoctorRequest {

    @NotBlank
    @JsonProperty("nome")
    public String name;

    @Past
    @JsonProperty("data_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate birthDate;

    @CPF
    @JsonProperty("documento")
    public String document;

    @Email
    public String email;

    public CreateDoctorRequest() {
    }
}
