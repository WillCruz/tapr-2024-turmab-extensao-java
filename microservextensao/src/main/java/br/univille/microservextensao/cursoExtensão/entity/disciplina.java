package br.univille.microservextensao.cursoExtensão.entity;

@Entity

public class disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String disciplina;

    private String status;

    private String cargaHoraria;

    private String professorResponsavel;

}
