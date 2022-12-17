package br.com.symbiosyssolucoes.shadow.service.controller;

import br.com.symbiosyssolucoes.shadow.domain.model.Doctor;
import br.com.symbiosyssolucoes.shadow.domain.model.controller.model.CreateDoctorRequest;
import br.com.symbiosyssolucoes.shadow.service.controller.model.response.CreateDoctorResponse;
import br.com.symbiosyssolucoes.shadow.service.controller.translate.TranslateDoctorCreate;
import br.com.symbiosyssolucoes.shadow.service.usecase.doctor.CreateDoctor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateDoctorAPIImpl implements CreateDoctorAPI{

    private final CreateDoctor createDoctor;

    public CreateDoctorAPIImpl(CreateDoctor createDoctor) {
        this.createDoctor = createDoctor;
    }


    @Override
    public CreateDoctorResponse create(@RequestBody CreateDoctorRequest request) {
        Doctor doctor = this.createDoctor.create(TranslateDoctorCreate.translate(request));

        return new CreateDoctorResponse(doctor);
    }
}
