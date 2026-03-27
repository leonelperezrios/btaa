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

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.unipamplona.ciadti.btaa.model.entity.UsuarioAspiranteEntity;

public interface UsuarioAspiranteRepository extends JpaRepository<UsuarioAspiranteEntity, Long> {

    @Query(value="select usas from UsuarioAspiranteEntity usas where usas.idPersonaGeneral = :id")
    Optional<UsuarioAspiranteEntity> findByGeneralPersonId(Long id);

    Optional<UsuarioAspiranteEntity> findByUsuario(String usuario);
    
}

/* 26/03/2026 @:Sebastian Jaimes */