package br.com.symbiosyssolucoes.shadow.domain.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID externalId;

    private String name;

    private LocalDate birthDate;

    private String document;

    @Enumerated(EnumType.STRING)
    private Especialization especialization;

    private Boolean active;

    private String email;

    private String password;

    @Deprecated
    public Doctor() {
    }

    public Doctor(String name, LocalDate birthDate, String document, String email) {
        this.externalId = UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
        this.document = document;
        this.email = email;
        this.especialization = Especialization.GENERAL;
        this.active = true;
    }
}
