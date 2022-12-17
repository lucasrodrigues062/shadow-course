package br.com.symbiosyssolucoes.shadow.gateway.repository;

import br.com.symbiosyssolucoes.shadow.domain.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long>   {
}
