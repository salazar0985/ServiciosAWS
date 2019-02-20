package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;

/**
 * Created by IDEX1010 on 19/02/2019.
 */
@Entity
@Table(name = "CampoServicio", schema = "", catalog = "Servicios")
public class CampoServicioEntity {
    private int idCampoServicio;
    private String nombre;
    private Boolean activo;

    @Id
    @Column(name = "IdCampoServicio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdCampoServicio() {
        return idCampoServicio;
    }

    public void setIdCampoServicio(int idCampoServicio) {
        this.idCampoServicio = idCampoServicio;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Activo")
    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CampoServicioEntity that = (CampoServicioEntity) o;

        if (idCampoServicio != that.idCampoServicio) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCampoServicio;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        return result;
    }
}
