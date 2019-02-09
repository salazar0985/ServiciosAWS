package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IDEX1010 on 08/02/2019.
 */
@Entity
@Table(name = "test", schema = "servicios")
public class Test {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, insertable = false, nullable = false)
    private Integer id;

    @Basic
    @Column(name = "Nombre", updatable = true, insertable = true, nullable = false)
    private String nombre;

    @Basic
    @Column(name = "FechaIni", updatable = true, insertable = true, nullable = false)
    private Date fechaIni;

    @Basic
    @Column(name = "FechaFin", updatable = true, insertable = true, nullable = false)
    private Date fechaFin;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaIni=" + fechaIni +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
