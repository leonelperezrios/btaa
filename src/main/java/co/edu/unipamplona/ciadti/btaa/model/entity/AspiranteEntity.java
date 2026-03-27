/**
 * Aplicación: btaa
 * Archivo: AspiranteEntity.java
 * Paquete: co.edu.unipamplona.ciadti.btaa.entity
 * Autor: GRUPO DE DESARROLLO ESPECÍFICO - CIADTI - Universidad de Pamplona
 * Fecha de creación: 25/03/2026
 * Modificaciones:
 * 26/03/2026 - Sebastian Jaimes - Creación inicial
 */
package co.edu.unipamplona.ciadti.btaa.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ASPIRANTE", schema = "TALENTOV3")
public class AspiranteEntity implements Serializable, Cloneable{
    @Id
    @Column(name = "PEGE_ID", nullable = false)
    private Long idPersonaGeneral;

    @Column(name = "ESAS_ID", nullable = false)
    private Long idEstadoAspirante;

    @Column(name = "ASPI_INFOCORROBORADA")
    private String infoCorroborada;

    @Column(name = "ASPI_REGISTRADOPOR", nullable = false)
    private String registradoPor;

    @Column(name = "ASPI_FECHACAMBIO", nullable = false)
    private Date fechaCambio;

    @OneToOne
    @JoinColumn(name = "PEGE_ID", insertable = false, updatable = false)
    private PersonaGeneralEntity personaGeneral;

    @OneToOne
    @JoinColumn(name = "ESAS_ID", insertable = false, updatable = false)
    private EstadoAspiranteEntity estadoAspirante;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AspiranteEntity [idPersonaGeneral=" + idPersonaGeneral + ", idEstadoAspirante=" + idEstadoAspirante + ", infoCorroborada=" + infoCorroborada + ", registradoPor=" + registradoPor + ", fechaCambio=" + fechaCambio + ", personaGeneral=" + personaGeneral + "]";
    }
    
}
/* 26/03/2026 @:Sebastian Jaimes */
