package com.dio.desafiofinal.model.form;

import com.dio.desafiofinal.model.Cliente;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalendarForm {
    @Positive
    private Long id;

    @NotEmpty(message = "Data de agendamento não pode ser nula")
    private LocalDate dataDoAgendamento;

    private List<Cliente> calendar = new ArrayList<>();
}
