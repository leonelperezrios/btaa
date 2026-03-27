package co.edu.unipamplona.ciadti.btaa.model.service;

import java.util.List;

import co.edu.unipamplona.ciadti.btaa.model.entity.UsuarioAspiranteEntity;

public interface UsuarioAspiranteService {
    List<UsuarioAspiranteEntity> findAll();
    UsuarioAspiranteEntity findById(Long id);
    UsuarioAspiranteEntity save(UsuarioAspiranteEntity dto);
    void delete(Long id);
}
