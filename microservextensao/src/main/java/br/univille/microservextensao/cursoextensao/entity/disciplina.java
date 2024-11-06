package br.univille.microservextensao.cursoextensao.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;


@EntityScan

public class disciplina {
    @Id

    private Long id;

    private String disciplina;

    private String status;

    private String cargaHoraria;

    private String professorResponsavel;

}
