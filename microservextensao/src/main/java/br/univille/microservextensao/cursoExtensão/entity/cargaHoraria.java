package br.univille.microservextensao.cursoExtensão.entity;

public class cargaHoraria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String horas;
}
