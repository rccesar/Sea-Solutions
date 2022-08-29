package com.seasolutions.rest.api.controller;


import com.seasolutions.rest.api.model.Trabalhador;
import com.seasolutions.rest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/nome")
    public ResponseEntity consultar(@PathVariable("nome") Integer nome) {
        return repository.findById(String.valueOf(nome))
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/nome")
    public Trabalhador salvar(@RequestBody Trabalhador usuario) {
        return repository.save(usuario);
    }

}
