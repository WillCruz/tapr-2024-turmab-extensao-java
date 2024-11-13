package br.univille.microservextensao.cursoextensao.entity;


import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "aluno", autoCreateContainer = true) /*Somente entidade root*/
public class Aluno {
    @Id /*Somente entidade root*/
    @PartitionKey
    @GeneratedValue
    private String id;    
    private String nome;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}