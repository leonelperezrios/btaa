package co.edu.unipamplona.ciadti.btaa.model.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unipamplona.ciadti.btaa.model.dto.TipoDocumentoGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.repository.TipoDocumentoGeneralRepository;
import co.edu.unipamplona.ciadti.btaa.mapper.GeneralDocumentTypeMapper;
import co.edu.unipamplona.ciadti.btaa.model.service.TipoDocumentoGeneralService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TipoDocumentoGeneralImpl implements TipoDocumentoGeneralService{

    private final TipoDocumentoGeneralRepository tipoDocumentoGeneralRepository;
    private final GeneralDocumentTypeMapper tipoDocumentoGeneralMapper;
    @Override
    public List<TipoDocumentoGeneralDTO> findAll() {
        return tipoDocumentoGeneralMapper.toTipoDocumentoGeneralDTOList(tipoDocumentoGeneralRepository.findAll());
    }

    @Override
    public TipoDocumentoGeneralDTO findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public TipoDocumentoGeneralDTO save(TipoDocumentoGeneralDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }




}
