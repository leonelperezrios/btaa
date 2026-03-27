/**
 * Aplicación: btaa
 * Archivo: PersonaGeneralRepository.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.repository
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 26/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "USUARIOASPIRANTE", schema = "TALENTOV3")
public class UsuarioAspiranteEntity implements Serializable, Cloneable{

    
    @Id
    @Column(name = "PEGE_ID", nullable = false)
    private Long idPersonaGeneral;


    @Column(name = "USAS_USUARIO", nullable = false)
    private String usuario;

    @Column(name = "USAS_CONTRASENA", nullable = false)
    private String contrasena;

    @Column(name = "USAS_REGISTRADOPOR", nullable = false)
    private String registradoPor;

    @Column(name = "USAS_FECHACAMBIO", nullable = false)
    private Date fechaCambio;

    @OneToOne
    @JoinColumn(name = "PEGE_ID", insertable = false, updatable = false)
    private PersonaGeneralEntity personaGeneral;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "UsuarioAspiranteEntity [idPersonaGeneral=" + idPersonaGeneral + ", usuario=" + usuario + ", contrasena=" + contrasena + ", registradoPor=" + registradoPor + ", fechaCambio=" + fechaCambio + ", personaGeneral=" + personaGeneral + "]";
    }
}
/* 26/03/2026 @:Sebastian Jaimes */
