package com.camila.resttemplate.controller;

import com.camila.resttemplate.model.Cliente;
import com.camila.resttemplate.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // recebe requisições para devolver endpoints rest
@RequestMapping("/clientes") // mapear requisições "/clientes"
public class ClienteController {

    @Autowired // instanciar automaticamente a implementação do repository em tempo de execução
    public ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping // recebe requisições post
    @ResponseStatus(HttpStatus.CREATED) // retornar 201 (created), ao invés de 200 (ok)
    public Cliente adicionar(@RequestBody Cliente cliente) { // requestBody converte o corpo da requisição para o java Cliente
        return clienteRepository.save(cliente);
    }
}
