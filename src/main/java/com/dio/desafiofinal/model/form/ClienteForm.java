package com.dio.desafiofinal.model.form;

import com.dio.desafiofinal.model.Calendar;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.hibernate.validator.constraints.br.CPF;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteForm {
    @Positive
    private Long id;

    @NotEmpty(message = "Nome não pode ser vazio ou nulo")
    @Size(min = 5, max = 200, message = "Nome precisar se do tamanho de {min} e {max}")
    private String nomeCompleto;

    @Positive(message = "Idade precisar ser positiva")
    @NotEmpty(message = "Idade não pode ser vazio")
    private int idade;

    @CPF
    private String cpf;
    private Calendar calendar;
}
