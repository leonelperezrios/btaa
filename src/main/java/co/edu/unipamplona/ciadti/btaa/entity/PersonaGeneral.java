/**
 * Aplicación: btaa
 * Archivo: PersonaGeneral.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.entity
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PERSONAGENERAL", schema = "GENERAL")
public class PersonaGeneral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PEGE_ID")
    private Long id;

    @Column(name = "PEGE_DOCUMENTOIDENTIDAD", nullable = false)
    private String  documentoIdentidad;
}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
