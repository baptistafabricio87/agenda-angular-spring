package com.gitlab.fabricio.castro.agenda.rest;

import com.gitlab.fabricio.castro.agenda.model.entity.Client;
import com.gitlab.fabricio.castro.agenda.model.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {

    private final ClientRepository repository;

    @Autowired
    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client saveClient(@RequestBody Client client) {
        return repository.save(client);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client findById(@PathVariable Integer id) {
        return repository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
    }
}
