package org.example.servicio_chernobyl.controller;

import model.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.PersonajeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeRepository;

    // Obtener todos los personajes
    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    // Obtener un personaje por ID
    @GetMapping("/{id}")
    public ResponseEntity<Personaje> getPersonajeById(@PathVariable Long id) {
        Optional<Personaje> personaje = personajeRepository.findById(id);
        return personaje.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}