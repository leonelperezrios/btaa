/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralRepository.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.repository
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 26/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unipamplona.ciadti.btaa.model.entity.AspiranteEntity;

public interface AspiranteRepository extends JpaRepository<AspiranteEntity, Long>{
    
}

/* 26/03/2026 @:Sebastian Jaimes */