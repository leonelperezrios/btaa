/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralMapper.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.mapper
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.mapper;

import co.edu.unipamplona.ciadti.btaa.dto.PersonaGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.entity.PersonaGeneral;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonaGeneralMapper {

    PersonaGeneralDTO toDto(PersonaGeneral entity);

    PersonaGeneral toEntity(PersonaGeneralDTO dto);

    List<PersonaGeneralDTO> toDtoList(List<PersonaGeneral> list);
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
