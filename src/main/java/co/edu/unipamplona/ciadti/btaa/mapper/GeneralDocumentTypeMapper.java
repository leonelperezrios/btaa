package co.edu.unipamplona.ciadti.btaa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.unipamplona.ciadti.btaa.model.dto.TipoDocumentoGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.entity.TipoDocumentoGeneralEntity;

@Mapper(componentModel = "spring")
public interface GeneralDocumentTypeMapper {
    TipoDocumentoGeneralDTO toTipoDocumentoGeneralDTO(TipoDocumentoGeneralEntity entity);

    TipoDocumentoGeneralEntity toTipoDocumentoGeneralEntity(TipoDocumentoGeneralDTO dto);

    List<TipoDocumentoGeneralDTO> toTipoDocumentoGeneralDTOList(List<TipoDocumentoGeneralEntity> list);
}
