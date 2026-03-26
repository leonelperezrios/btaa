package co.edu.unipamplona.ciadti.btaa.model.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unipamplona.ciadti.btaa.model.entity.TipoDocumentoGeneralEntity;
import co.edu.unipamplona.ciadti.btaa.model.repository.TipoDocumentoGeneralRepository;
import co.edu.unipamplona.ciadti.btaa.model.service.TipoDocumentoGeneralService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TipoDocumentoGeneralImpl implements TipoDocumentoGeneralService{

    private final TipoDocumentoGeneralRepository tipoDocumentoGeneralRepository;

    @Override
    public List<TipoDocumentoGeneralEntity> findAll() {
        return tipoDocumentoGeneralRepository.findAll();
    }

    @Override
    public TipoDocumentoGeneralEntity findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public TipoDocumentoGeneralEntity save(TipoDocumentoGeneralEntity dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    

    
}
