package br.univille.microservextensao.cursoextensao.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservextensao.cursoextensao.entity.Curso;

@Repository
public interface CursoRepository
    extends CrudRepository<Curso,String>{
    
}