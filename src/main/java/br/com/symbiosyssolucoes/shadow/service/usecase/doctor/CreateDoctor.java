package br.com.symbiosyssolucoes.shadow.service.usecase.doctor;

import br.com.symbiosyssolucoes.shadow.domain.model.Doctor;
import br.com.symbiosyssolucoes.shadow.gateway.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateDoctor {

    private final DoctorRepository doctorRepository;

    public CreateDoctor(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor create(Doctor request) {
        return doctorRepository.save(request);
    }

}
