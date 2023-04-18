package com.dio.desafiofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cliente_id")
    private Long id;
    private String nomeCompleto;
    private int idade;
    private LocalDate dataDeCriacao = LocalDate.now();
    @Column(unique = true)
    private String cpf;
    @JoinColumn(name = "calendar_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Calendar calendar;


}
