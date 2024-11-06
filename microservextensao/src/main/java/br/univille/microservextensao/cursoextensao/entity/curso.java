package br.univille.microservextensao.cursoextensao.entity;


import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;


@Container(containerName = "curso", autoCreateContainer = true)
public class curso {
    @Id
    @PartitionKey
    @GeneratedValue
    private UUID id;

    private String curso;

    private String status;
    
    private String disciplinas;
    
    
    
}
