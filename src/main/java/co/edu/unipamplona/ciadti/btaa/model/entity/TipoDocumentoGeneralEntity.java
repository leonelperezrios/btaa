/**
 * Aplicación: btaa
 * Archivo: PersonaGeneral.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.entity
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TIPODOCUMENTOGENERAL", schema = "GENERAL")
public class TipoDocumentoGeneralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIDG_ID")
    private Long id;

    @Column(name = "TIDG_DESCRIPCION")
    private String nombre;

    @Column(name = "TIDG_TIPOPERSONA")
    private String tipoPersona;

    @Column(name = "TIDG_ABREVIATURA")
    private String abreviatura;
     
}


/* 25/03/2026 @:Sebastian Jaimes */
