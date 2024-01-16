package com.camila.resttemplate.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity // entidade mapeada para uma tabela no DB que tem relação com a classe cliente
@Data // gerar getter and setter via lombok
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) // não pode ser not null
    private String nome;

}
