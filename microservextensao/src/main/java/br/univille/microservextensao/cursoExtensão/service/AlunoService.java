package br.univille.microservextensao.cursoExtensão.service;
import java.util.List;

import br.univille.microservextensao.cursoExtensão.entity.Aluno;

public interface AlunoService {
    
    List<Aluno> getAll();
    Aluno save(Aluno aluno);

}