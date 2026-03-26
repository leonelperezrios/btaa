/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralRepository.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.repository
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unipamplona.ciadti.btaa.model.entity.PersonaGeneral;

public interface PersonaGeneralRepository extends JpaRepository<PersonaGeneral, Long> {

    
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */

