package com.dio.desafiofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Calendar {
    @Column(name = "calendar_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private LocalDate dataDoAgendamento;

    @JsonIgnore
    @OneToMany(mappedBy = "calendar", fetch = FetchType.LAZY)
    private List<Cliente> clientes = new ArrayList<>();
}
