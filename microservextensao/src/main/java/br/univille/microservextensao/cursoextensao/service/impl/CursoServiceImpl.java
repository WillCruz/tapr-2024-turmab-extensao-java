package br.univille.microservextensao.cursoextensao.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservextensao.cursoextensao.entity.Curso;
import br.univille.microservextensao.cursoextensao.repository.CursoRepository;
import br.univille.microservextensao.cursoextensao.service.CursoService;

@Service
public class CursoServiceImpl 
    implements CursoService{

    @Autowired
    private CursoRepository repository;

    @Override
    public List<Curso> getAll() {
        var retorno = repository.findAll();
        List<Curso> listaCursos = new ArrayList<Curso>();
        retorno.forEach(listaCursos::add);

        return listaCursos;
    }

    @Override
    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    @Override
        public Curso update(String id, Curso curso) {
            var buscaCursoAntigo = repository.findById(id);
            if(buscaCursoAntigo.isPresent()){
                var cursoAntigo = buscaCursoAntigo.get();
                cursoAntigo.setNome(curso.getNome());

                repository.save(cursoAntigo);
                return cursoAntigo;
            }
            return null;
    }

    @Override
    public Curso delete(String id) {
        var buscaCursoAntigo = repository.findById(id);
            if(buscaCursoAntigo.isPresent()){
                var cursoAntigo = buscaCursoAntigo.get();
                repository.delete(cursoAntigo);
                return cursoAntigo;
            }
            return null;
    }
}