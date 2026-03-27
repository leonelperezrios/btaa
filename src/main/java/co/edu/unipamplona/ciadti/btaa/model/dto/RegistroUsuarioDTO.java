/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralDTO.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.dto
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 26/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.dto;

public record RegistroUsuarioDTO(
    Long id,
    String primerApellido,
    String segundoApellido,
    String primerNombre,
    String segundoNombre,
    Long tipoPersona,
    String mail,
    String sexo,
    Long idTipoDocumentoIdentidad,
    String documentoIdentidad,
    String usuario,
    String contrasena,
    String vive
) {}
/* 26/03/2026 @:Sebastian Jaimes */