/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralController.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.controller
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.controller;

import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaContactoUpdateDTO;
import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.service.PersonaGeneralService;
import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaNombresUpdateDTO;
import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaUbicacionUpdateDTO;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persona-general")
public class GeneralPersonController {
    private final PersonaGeneralService service;

    public GeneralPersonController(PersonaGeneralService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonaGeneralDTO> getAll() {
        return service.findAll();
    }

    @PostMapping
    public PersonaGeneralDTO create(@RequestBody PersonaGeneralDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public PersonaGeneralDTO update(@PathVariable Long id, @RequestBody PersonaGeneralDTO dto) {
        return service.update(id, dto);
    }

    @PatchMapping("/{id}/contacto")
    public PersonaGeneralDTO updateContacto(@PathVariable Long id, @RequestBody PersonaContactoUpdateDTO dto) {
        return service.updateContacto(id, dto);
    }

    @PatchMapping("/{id}/personal-info")
    public PersonaGeneralDTO updateNombres(@PathVariable Long id, @RequestBody PersonaNombresUpdateDTO dto) {
        return service.updateNombres(id, dto);
    }

    @PatchMapping("/{id}/ubicacion")
    public PersonaGeneralDTO updateUbicacion(@PathVariable Long id, @RequestBody PersonaUbicacionUpdateDTO dto) {
        return service.updateUbicacion(id, dto);
    }

    @GetMapping("/{id}")
    public PersonaGeneralDTO getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
