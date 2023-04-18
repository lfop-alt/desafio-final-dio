package com.dio.desafiofinal.services;

import com.dio.desafiofinal.model.Cliente;
import com.dio.desafiofinal.repository.ClienteRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {
    @Autowired
    private final ClienteRepository clienteRepository;

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    public Cliente createClient(@Valid Cliente form) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNomeCompleto(form.getNomeCompleto());
        novoCliente.setIdade(form.getIdade());
        novoCliente.setCpf(form.getCpf());
        novoCliente.setCalendar(form.getCalendar());
        return clienteRepository.save(novoCliente);
    }

    public Cliente alterarCliente(@Valid Long id, Cliente form) {
        Cliente novoCliente = clienteRepository.findById(id).orElseThrow(NullPointerException::new);
        novoCliente.setCpf(form.getCpf());
        novoCliente.setIdade(form.getIdade());
        novoCliente.setNomeCompleto(form.getNomeCompleto());
        novoCliente.setCalendar(form.getCalendar());
        return clienteRepository.save(novoCliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente buscarOneCliente(Long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

}
