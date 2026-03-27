/**
 * Aplicación: btaa
 * Archivo: EstadoAspiranteEntity.java
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
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "ESTADOASPIRANTE", schema = "TALENTOV3")
public class EstadoAspiranteEntity implements Serializable, Cloneable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ESAS_ID", nullable = false)
    private Long id;

    @Column(name = "ESAS_NOMBRE")
    private String nombre;

    @Column(name = "ESAS_REGISTRADOPOR", nullable = false)
    private String registradoPor;

    @Column(name = "ESAS_FECHACAMBIO", nullable = false)
    private Date fechaCambio;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "EstadoAspiranteEntity [id=" + id + ", nombre=" + nombre + ", registradoPor=" + registradoPor + ", fechaCambio=" + fechaCambio + "]";
    }
}

/* 26/03/2026 @:Sebastian Jaimes */