package br.univille.microservextensao.cursoextensao.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;

public class statusCurso {
    @Id

    private Long id;

    private String status;

}
