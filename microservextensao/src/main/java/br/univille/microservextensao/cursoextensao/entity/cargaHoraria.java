package br.univille.microservextensao.cursoextensao.entity;

import org.springframework.aot.generate.GenerationContext;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;

public class cargaHoraria {
    @Id

    private Long id;

    private String horas;
}
