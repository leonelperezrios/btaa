/**
 * Aplicación: btaa
 * Archivo: PersonaGenaralService.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.service
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.service;

import co.edu.unipamplona.ciadti.btaa.dto.PersonaGeneralDTO;

import java.util.List;

public interface PersonaGenaralService {
    List<PersonaGeneralDTO> findAll();
    PersonaGeneralDTO findById(Long id);
    PersonaGeneralDTO save(PersonaGeneralDTO dto);
    void delete(Long id);
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
