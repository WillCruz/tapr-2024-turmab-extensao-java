package br.univille.microservextensao.cursoExtensão.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservextensao.cursoExtensão.entity.Aluno;
import br.univille.microservextensao.cursoExtensão.repository.AlunoRepository;
import br.univille.microservextensao.cursoExtensão.service.AlunoService;

@Service
public class AlunoServiceImpl 
    implements AlunoService{

    @Autowired
    private AlunoRepository repository;

    @Override
    public List<Aluno> getAll() {
        var retorno = repository.findAll();
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        retorno.forEach(listaAlunos::add);

        return listaAlunos;
    }

    @Override
    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }
}