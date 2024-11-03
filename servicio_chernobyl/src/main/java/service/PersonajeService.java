package service;


import model.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonajeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService {
    private final PersonajeRepository personajeRepository;

    @Autowired
    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    public Optional<Personaje> findById(Long id) {
        return personajeRepository.findById(id);
    }

    public Personaje savePersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }
}