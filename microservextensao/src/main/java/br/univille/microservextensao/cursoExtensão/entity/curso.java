package br.univille.microservextensao.entidades;

@Entity

public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String curso;

    private String status;

    private String disciplinas;
    
    
    
}
