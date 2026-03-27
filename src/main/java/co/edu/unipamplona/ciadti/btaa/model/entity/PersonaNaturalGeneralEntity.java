package co.edu.unipamplona.ciadti.btaa.model.entity;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PERSONANATURALGENERAL", schema = "GENERAL")
public class PersonaNaturalGeneralEntity implements Serializable, Cloneable{

    @Id
    @Column(name = "PEGE_ID", nullable = false)
    private Long idPersonaGeneral;

    @Column(name = "PENG_PRIMERAPELLIDO", nullable = false)
    private String primerApellido;

    @Column(name = "PENG_SEGUNDOAPELLIDO")
    private String segundoApellido;

    @Column(name = "PENG_PRIMERNOMBRE", nullable = false)
    private String primerNombre;

    @Column(name = "PENG_SEGUNDONOMBRE")
    private String segundoNombre;

    @Column(name = "PENG_SEXO", nullable = false)
    private String sexo;

    @Column(name = "PENG_LIBRETAMILITAR")
    private String libretaMilitar;

    @Column(name = "PENG_RH")
    private String rh;

    @Column(name = "PENG_DISTRITOMILITAR")
    private String distritoMilitar;

    @Column(name = "PENG_NUMEROPASAPORTE")
    private String numeroPasaporte;

    @Column(name = "PENG_OTRANACIONALIDAD")
    private String otraNacionalidad;

    @Column(name = "PENG_EMAILINSTITUCIONAL")
    private String emailInstitucional;

    @Column(name = "PENG_UBICACIONFISICAHOJAVIDA")
    private String ubicacionFisicaHojavida;

    @Column(name = "PENG_CLASELIBRETAMILITAR")
    private String claseLibretaMilitar;

    @Column(name = "PENG_VIVE")
    private String vive;

    @Column(name = "PENG_FAX")
    private String fax;

    @Column(name = "PENG_FECHAVIGENCIAPASAPORTE")
    private Date fechaVigenciaPasaporte;


    @Column(name = "PENG_FECHANACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "PENG_REGISTRADOPOR", nullable = false)
    private String registradoPor;

    @Column(name = "PENG_FECHACAMBIO", nullable = false)
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
        return "PersonaNaturalGeneralEntity [idPersonaGeneral=" + idPersonaGeneral + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", sexo=" + sexo + ", ubicacionFisicaHojavida=" + ubicacionFisicaHojavida + ", claseLibretaMilitar=" + claseLibretaMilitar + ", vive=" + vive + ", fax=" + fax + ", fechaVigenciaPasaporte=" + fechaVigenciaPasaporte + ", fechaNacimiento=" + fechaNacimiento + ", registradoPor=" + registradoPor + ", fechaCambio=" + fechaCambio + ", personaGeneral=" + personaGeneral + "]";
    }
}

    