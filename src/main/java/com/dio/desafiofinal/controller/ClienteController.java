package com.dio.desafiofinal.controller;

import com.dio.desafiofinal.model.Cliente;
import com.dio.desafiofinal.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    public List<Cliente> getAllClient(){
        return clienteService.getAll();
    }
}
