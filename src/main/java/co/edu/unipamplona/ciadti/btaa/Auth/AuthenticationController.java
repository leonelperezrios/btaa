/**
 * Aplicación: btaa
 * Archivo: AuthController.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.controller
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.Auth;

import org.springframework.web.bind.annotation.RestController;

import co.edu.unipamplona.ciadti.btaa.model.dto.PersonaGeneralDTO;
import co.edu.unipamplona.ciadti.btaa.model.entity.TipoDocumentoGeneralEntity;
import co.edu.unipamplona.ciadti.btaa.model.service.TipoDocumentoGeneralService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final TipoDocumentoGeneralService tipoDocumentoGeneralService;


    @Operation(
        summary = "Obtiene todos los tipos de documentos generales",
        description = "Obtiene todos los tipos de documentos generales"
    )
    @GetMapping("/document-type")
    public ResponseEntity<?> getDocumentType() throws Exception{
        List<TipoDocumentoGeneralEntity> generalDocumentType = tipoDocumentoGeneralService.findAll();
        return new ResponseEntity<>(generalDocumentType, HttpStatus.OK);
    }

    @PostMapping("/signup")
    private PersonaGeneralDTO signup(@RequestBody PersonaGeneralDTO dto){

        return null;
    }
    
    
}
