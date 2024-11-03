package org.example.servicio_chernobyl.controller;

import model.Capitulo;

import java.util.List;
import java.util.Optional;

public class CapituloRepository {
    public List<Capitulo> findAll() {
        return null;
    }

    public Optional<Capitulo> findById(Long id) {
        return null;
    }

    public List<Capitulo> findByTemporadaId(Long temporadaId) {
        return null;
    }

    public Double findPromedioCalificacionBySerieId(Long id) {
            return null;
    }

    public List<Capitulo> findTopBySerieIdOrderByCalificacionDesc(Long id) {
            return null;
    }
}
