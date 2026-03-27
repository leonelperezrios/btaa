/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralImp.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.service.impl
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.service.impl;

import co.edu.unipamplona.ciadti.btaa.mapper.GeneralPersonMapper;
import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.dto.RegistroUsuarioDTO;
import co.edu.unipamplona.ciadti.btaa.model.entity.AspiranteEntity;
import co.edu.unipamplona.ciadti.btaa.model.entity.PersonaGeneralEntity;
import co.edu.unipamplona.ciadti.btaa.model.entity.PersonaNaturalGeneralEntity;
import co.edu.unipamplona.ciadti.btaa.model.entity.UsuarioAspiranteEntity;
import co.edu.unipamplona.ciadti.btaa.model.repository.AspiranteRepository;
import co.edu.unipamplona.ciadti.btaa.model.repository.PersonaGeneralRepository;
import co.edu.unipamplona.ciadti.btaa.model.repository.PersonaNaturalGeneralRepository;
import co.edu.unipamplona.ciadti.btaa.model.repository.UsuarioAspiranteRepository;
import co.edu.unipamplona.ciadti.btaa.model.service.PersonaGeneralService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaGeneralImp implements PersonaGeneralService {

    private final PersonaGeneralRepository personaGeneralRepository;
    private final GeneralPersonMapper mapper;
    private final UsuarioAspiranteRepository usuarioAspiranteRepository;
    private final AspiranteRepository aspiranteRepository;
    private final PersonaNaturalGeneralRepository personaNaturalGeneralRepository;
    private final PasswordEncoder passwordEncoder;



    @Override
    public List<PersonaGeneralDTO> findAll() {
        return mapper.toDtoList(personaGeneralRepository.findAll());
    }

    @Override
    public PersonaGeneralDTO findById(Long id) {
        PersonaGeneralEntity personaGeneral = personaGeneralRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return mapper.toDto(personaGeneral);
    }

    @Override
    public PersonaGeneralDTO save(PersonaGeneralDTO dto) {
        PersonaGeneralEntity entity = mapper.toEntity(dto);
        return mapper.toDto(personaGeneralRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        personaGeneralRepository.deleteById(id);
    }

    @Override
    @Transactional
    public String registerUser(RegistroUsuarioDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("El DTO no puede ser null");
        }
        
        PersonaGeneralEntity personaGeneral = new PersonaGeneralEntity();
        personaGeneral.setTipoPersona(dto.tipoPersona());
        personaGeneral.setMail(dto.mail());
        personaGeneral.setIdTipoDocumentoIdentidad(dto.idTipoDocumentoIdentidad());
        personaGeneral.setDocumentoIdentidad(dto.documentoIdentidad());
        personaGeneral.setRegistradoPor("REGISTRO_WEB");
        personaGeneral.setFechaCambio(new Date());

        PersonaGeneralEntity personaGuardada = personaGeneralRepository.save(personaGeneral);
        Long pegeId = personaGuardada.getId();
        
        UsuarioAspiranteEntity usuarioAspirante = new UsuarioAspiranteEntity();
        usuarioAspirante.setIdPersonaGeneral(pegeId);
        usuarioAspirante.setUsuario(dto.usuario());
        //usuarioAspirante.setContrasena(passwordEncoder.encode(dto.contrasena()));
        usuarioAspirante.setContrasena(dto.contrasena());
        usuarioAspirante.setRegistradoPor("REGISTRO_WEB");
        usuarioAspirante.setFechaCambio(new Date());

        System.out.println("[DEBUG] UsuarioAspiranteEntity: " + usuarioAspirante);

        usuarioAspiranteRepository.save(usuarioAspirante);

        PersonaNaturalGeneralEntity personaNaturalGeneral = new PersonaNaturalGeneralEntity();
        personaNaturalGeneral.setIdPersonaGeneral(pegeId);
        personaNaturalGeneral.setPrimerApellido(dto.primerApellido());
        personaNaturalGeneral.setSegundoApellido(dto.segundoApellido());
        personaNaturalGeneral.setPrimerNombre(dto.primerNombre());
        personaNaturalGeneral.setSegundoNombre(dto.segundoNombre());
        personaNaturalGeneral.setSexo(dto.sexo());
        personaNaturalGeneral.setVive("1");
        personaNaturalGeneral.setRegistradoPor("REGISTRO_WEB");
        personaNaturalGeneral.setFechaCambio(new Date());

        personaNaturalGeneralRepository.save(personaNaturalGeneral);

        AspiranteEntity aspiranteEntity = new AspiranteEntity();
        aspiranteEntity.setIdPersonaGeneral(pegeId);
        aspiranteEntity.setIdEstadoAspirante(1L);
        aspiranteEntity.setRegistradoPor("REGISTRO_WEB");
        aspiranteEntity.setFechaCambio(new Date());

        aspiranteRepository.save(aspiranteEntity);


        return "Usuario registrado correctamente";

    }
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
