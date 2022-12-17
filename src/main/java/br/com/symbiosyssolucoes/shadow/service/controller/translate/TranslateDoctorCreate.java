package br.com.symbiosyssolucoes.shadow.service.controller.translate;

import br.com.symbiosyssolucoes.shadow.domain.model.Doctor;
import br.com.symbiosyssolucoes.shadow.domain.model.controller.model.CreateDoctorRequest;

public class TranslateDoctorCreate {

    public static Doctor translate(CreateDoctorRequest request) {
        return new Doctor(request.name, request.birthDate, request.document, request.email);
    }
}
