package br.univille.microservextensao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import br.univille.microservextensao.cursoExtensão.entity.Aluno;
import br.univille.microservextensao.cursoExtensão.repository.AlunoRepository;

@Component
public class Startup {
    @Autowired
    private AlunoRepository repository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        var aluno = new Aluno();
        aluno.setNome("Mariazinha");
        repository.save(aluno);

    }
}