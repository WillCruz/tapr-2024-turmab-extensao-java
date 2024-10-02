package br.univille.microservextensao.cursoExtensão.entity;

@Entity
public class statusCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

}
