/**
 * Aplicación: btaa
 * Archivo: PersonaGeneral.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.entity
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 25/03/2026 - Leonel Antonio Pérez Ríos - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PERSONAGENERAL", schema = "GENERAL")
public class PersonaGeneral implements Serializable, Cloneable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PEGE_ID")
    private Long id;

    @Column(name = "PEGE_TIPOPERSONA", nullable = false)
    private String tipoPersona;

    @Column(name = "PEGE_DIRECCION")
    private String direccion;

    @Column(name = "PEGE_MAIL")
    private String mail;

    @Column(name = "PEGE_TELEFONOCELULAR")
    private String telefonoCelular;

    @Column(name = "PEGE_TELEFONO")
    private String telefono;

    @Column(name = "TIDG_ID", nullable = false)
    private Long idTipoDocumentoIdentidad;

    @Column(name = "PEGE_DOCUMENTOIDENTIDAD", nullable = false)
    private String  documentoIdentidad;

    @Column(name = "PEGE_LUGAREXPEDICION")
    private String lugarExpedicion;

    @Column(name = "PEGE_FECHAEXPEDICION")
    private Date fechaExpedicion;

    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "TIDG_ID", insertable = false, updatable = false)
    private TipoDocumentoGeneralEntity tipoDocumentoIdentidad;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
