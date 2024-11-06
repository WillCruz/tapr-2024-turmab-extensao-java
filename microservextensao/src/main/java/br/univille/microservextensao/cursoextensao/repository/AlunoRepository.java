package br.univille.microservextensao.cursoextensao.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.univille.microservextensao.cursoextensao.entity.Aluno;

@Repository
public interface AlunoRepository
    extends CrudRepository<Aluno,String>{
    
}