package br.univille.microservextensao.cursoextensao.service;
import java.util.List;

import br.univille.microservextensao.cursoextensao.entity.Aluno;

public interface AlunoService {
    
    List<Aluno> getAll();
    Aluno save(Aluno aluno);

}