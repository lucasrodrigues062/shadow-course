package br.com.symbiosyssolucoes.shadow.service.controller.model.response;

import br.com.symbiosyssolucoes.shadow.domain.model.Doctor;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class CreateDoctorResponse {

    @JsonProperty("data_nascimento") @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    private String email;

    @JsonProperty("nome")
    private String name;

    private String id;

    @JsonProperty("especializacao")
    private String specialization;

    public CreateDoctorResponse(Doctor doctor) {

        this.birthDate = doctor.getBirthDate();
        this.email = doctor.getEmail();
        this.name = doctor.getName();
        this.id = doctor.getExternalId().toString();
        this.specialization = doctor.getEspecialization().name();

    }

    @Deprecated
    public CreateDoctorResponse(){};
}
