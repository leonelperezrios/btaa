/**
 * Aplicación: btaa
 * Archivo: PersonaGenaralService.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.service
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.service;

import java.util.List;

import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaGeneralDTO;

public interface PersonaGenaralService {
    List<PersonaGeneralDTO> findAll();
    PersonaGeneralDTO findById(Long id);
    PersonaGeneralDTO save(PersonaGeneralDTO dto);
    void delete(Long id);
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
