package br.univille.microservextensao.entidades;


import java.util.UUID;


@Container(containerName = "curso", autoCreateCintainer = true)
public class curso {
    @Id
    @PartitionKey
    @GeneratedValue
    private UUID id;

    private String curso;

    private String status;
    
    private String disciplinas;
    
    
    
}
