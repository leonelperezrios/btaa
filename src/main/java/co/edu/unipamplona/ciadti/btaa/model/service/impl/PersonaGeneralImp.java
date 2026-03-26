/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralImp.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.service.impl
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.service.impl;

import co.edu.unipamplona.ciadti.btaa.mapper.PersonaGeneralMapper;
import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.entity.PersonaGeneral;
import co.edu.unipamplona.ciadti.btaa.model.repository.PersonaGeneralRepository;
import co.edu.unipamplona.ciadti.btaa.model.service.PersonaGenaralService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaGeneralImp implements PersonaGenaralService {

    private final PersonaGeneralRepository repository;
    private final PersonaGeneralMapper mapper;

    public PersonaGeneralImp(PersonaGeneralRepository personaGeneralRepository, PersonaGeneralMapper mapper) {
        this.repository = personaGeneralRepository;
        this.mapper = mapper;
    }

    @Override
    public List<PersonaGeneralDTO> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public PersonaGeneralDTO findById(Long id) {
        PersonaGeneral personaGeneral = repository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return mapper.toDto(personaGeneral);
    }

    @Override
    public PersonaGeneralDTO save(PersonaGeneralDTO dto) {
        PersonaGeneral entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
