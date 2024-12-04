package br.univille.microservextensao.cursoextensao.service;
import java.util.List;

import br.univille.microservextensao.cursoextensao.entity.Curso;

public interface CursoService {
    
    List<Curso> getAll();
    Curso save(Curso curso);
    Curso update(String id, Curso curso);
    Curso delete(String id);
    
}