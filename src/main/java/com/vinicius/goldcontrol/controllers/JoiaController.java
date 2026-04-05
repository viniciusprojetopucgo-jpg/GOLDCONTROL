package com.vinicius.goldcontrol.controllers;

import com.vinicius.goldcontrol.entities.Joia;
import com.vinicius.goldcontrol.repositories.JoiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*") // Permite que o seu HTML acesse a API
@RestController
@RequestMapping(value = "/joias")
public class JoiaController {

    @Autowired
    private JoiaRepository repository;

    // Busca todas as joias
    @GetMapping
    public List<Joia> findAll() {
        return repository.findAll();
    }

    // Busca uma joia específica por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Joia> findById(@PathVariable Long id) {
        Joia joia = repository.findById(id).get();
        return ResponseEntity.ok().body(joia);
    }

    // Insere uma nova joia
    @PostMapping
    public ResponseEntity<Joia> insert(@RequestBody Joia joia) {
        joia = repository.save(joia);
        return ResponseEntity.status(HttpStatus.CREATED).body(joia);
    }

    // Deleta uma joia por ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Atualiza uma joia existente (O que faltava!)
    @PutMapping(value = "/{id}")
    public ResponseEntity<Joia> update(@PathVariable Long id, @RequestBody Joia obj) {
        Joia entity = repository.findById(id).get();
        
        // Atualiza os campos necessários
        entity.setNome(obj.getNome());
        entity.setPeso(obj.getPeso());
        entity.setPureza(obj.getPureza());
        entity.setPrecoFixo(obj.getPrecoFixo());
        entity.setStatus(obj.getStatus());
        entity.setDescricao(obj.getDescricao());
        
        entity = repository.save(entity);
        return ResponseEntity.ok().body(entity);
    }
}