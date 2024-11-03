package org.example.servicio_chernobyl.controller;

import model.Temporada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.TemporadaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/temporadas")
public class TemporadaController {

    @Autowired
    private TemporadaRepository temporadaRepository;

    // Obtener todas las temporadas
    @GetMapping
    public List<Temporada> getAllTemporadas() {
        return temporadaRepository.findAll();
    }

    // Obtener una temporada por ID
    @GetMapping("/{id}")
    public ResponseEntity<Temporada> getTemporadaById(@PathVariable Long id) {
        Optional<Temporada> temporada = temporadaRepository.findById(id);
        return temporada.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Obtener todas las temporadas de una serie específica
    @GetMapping("/serie/{serieId}")
    public List<Temporada> getTemporadasBySerieId(@PathVariable Long serieId) {
        return temporadaRepository.findBySerieId(serieId);
    }
}