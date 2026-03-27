/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralDTO.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.dto
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.dto;

import java.util.Date;

public record PersonaGeneralDTO (
    Long id,
    String tipoPersona,
    String direccion,
    String mail,
    String telefonoCelular,
    String telefono,
    Long idTipoDocumentoIdentidad,
    String documentoIdentidad,
    String lugarExpedicion,
    Date fechaExpedicion,
    String tipoDocumentoIdentidadNombre,
    String tipoDocumentoIdentidadAbreviatura,
    PersonaNaturalGeneralDTO personaNaturalGeneral
){}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
