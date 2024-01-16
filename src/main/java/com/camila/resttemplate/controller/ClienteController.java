package com.camila.resttemplate.controller;

import com.camila.resttemplate.model.Cliente;
import com.camila.resttemplate.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
