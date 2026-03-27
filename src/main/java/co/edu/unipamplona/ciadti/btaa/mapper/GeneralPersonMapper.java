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

import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaNaturalGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.entity.PersonaGeneralEntity;
import co.edu.unipamplona.ciadti.btaa.model.entity.PersonaNaturalGeneralEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GeneralPersonMapper {

    @Mapping(target = "tipoDocumentoIdentidadNombre", source = "tipoDocumentoIdentidad.descripcion")
    @Mapping(target = "tipoDocumentoIdentidadAbreviatura", source = "tipoDocumentoIdentidad.abreviatura")
    PersonaGeneralDTO toDto(PersonaGeneralEntity entity);

    PersonaGeneralEntity toEntity(PersonaGeneralDTO dto);

    PersonaNaturalGeneralDTO toPersonaNaturalDto(PersonaNaturalGeneralEntity entity);

    List<PersonaGeneralDTO> toDtoList(List<PersonaGeneralEntity> list);
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
