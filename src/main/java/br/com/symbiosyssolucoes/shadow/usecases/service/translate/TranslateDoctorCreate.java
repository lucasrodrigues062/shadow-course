package br.com.symbiosyssolucoes.shadow.usecases.service.translate;

import br.com.symbiosyssolucoes.shadow.domain.model.Doctor;
import br.com.symbiosyssolucoes.shadow.domain.model.controller.model.CreateDoctorDto;

public class TranslateDoctorCreate {

    public static Doctor translate(CreateDoctorDto request) {
        return new Doctor(request.name, request.birthDate, request.document, request.email);
    }
}
