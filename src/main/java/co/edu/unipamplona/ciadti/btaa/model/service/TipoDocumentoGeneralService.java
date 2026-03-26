/**
 * Aplicación: btaa
 * Archivo: PersonaGenaralService.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.service
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.service;

import java.util.List;

import co.edu.unipamplona.ciadti.btaa.model.entity.TipoDocumentoGeneralEntity;


public interface TipoDocumentoGeneralService {
    List<TipoDocumentoGeneralEntity> findAll();
    TipoDocumentoGeneralEntity findById(Long id);
    TipoDocumentoGeneralEntity save(TipoDocumentoGeneralEntity dto);
    void delete(Long id);
}
