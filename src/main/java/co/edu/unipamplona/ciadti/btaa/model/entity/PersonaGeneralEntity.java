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


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PERSONAGENERAL", schema = "GENERAL")
public class PersonaGeneralEntity implements Serializable, Cloneable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PEGE_ID")
    private Long id;

    @Column(name = "PEGE_TIPOPERSONA", nullable = false)
    private Long tipoPersona;

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

    @Column(name = "PEGE_REGISTRADOPOR")
    private String registradoPor;

    @Column(name = "PEGE_FECHACAMBIO")
    private Date fechaCambio;

    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "TIDG_ID", insertable = false, updatable = false)
    private TipoDocumentoGeneralEntity tipoDocumentoIdentidad;

    @OneToOne(mappedBy = "personaGeneral", fetch = FetchType.LAZY)
    private PersonaNaturalGeneralEntity personaNaturalGeneral;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PersonaGeneralEntity [id=" + id + ", tipoPersona=" + tipoPersona + ", direccion=" + direccion + ", mail=" + mail + ", telefonoCelular=" + telefonoCelular + ", telefono=" + telefono + ", idTipoDocumentoIdentidad=" + idTipoDocumentoIdentidad + ", documentoIdentidad=" + documentoIdentidad + ", lugarExpedicion=" + lugarExpedicion + ", fechaExpedicion=" + fechaExpedicion + ", tipoDocumentoIdentidad=" + tipoDocumentoIdentidad + ", registradoPor=" + registradoPor + ", fechaCambio=" + fechaCambio + "]";
    }

}

/* 25/03/2026 @:Leonel Antonio Pérez Ríos */
