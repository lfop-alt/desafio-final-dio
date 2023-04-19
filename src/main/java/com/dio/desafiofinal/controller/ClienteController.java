package com.dio.desafiofinal.controller;

import com.dio.desafiofinal.model.Cliente;
import com.dio.desafiofinal.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClient(){
        return clienteService.getAll();
    }

    public Cliente create(@RequestBody Cliente form) {
        return clienteService.createClient(form);
    }

    public Cliente alterar(@RequestBody Cliente form, @PathVariable Long id) {
        return clienteService.alterarCliente(id, form);
    }

    public Cliente buscarCliente(@PathVariable Long id){
        return clienteService.buscarOneCliente(id);
    }

    public String delete(@PathVariable Long id) {
        clienteService.deleteCliente(id);
        return "Cliente Deletado! ";
    }
}
