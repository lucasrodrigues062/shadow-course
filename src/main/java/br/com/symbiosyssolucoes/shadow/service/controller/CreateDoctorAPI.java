package br.com.symbiosyssolucoes.shadow.service.controller;


import br.com.symbiosyssolucoes.shadow.domain.model.controller.model.CreateDoctorRequest;
import br.com.symbiosyssolucoes.shadow.service.Routes;
import br.com.symbiosyssolucoes.shadow.service.controller.model.response.CreateDoctorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(Routes.CREATE_DOCTOR)
public interface CreateDoctorAPI {

    @PostMapping(produces = {"application/json"}, consumes = {"application/json"})
    CreateDoctorResponse create(CreateDoctorRequest request);
}
