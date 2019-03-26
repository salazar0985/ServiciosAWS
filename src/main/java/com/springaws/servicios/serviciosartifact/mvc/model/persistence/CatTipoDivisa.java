package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by IDEX1010 on 19/02/2019.
 */
@Entity
@Table(name = "Cat_TipoDivisa", schema = "", catalog = "Servicios")
public class CatTipoDivisa {
    private int idDivisa;
    private String clave;
    private String descripcion;

    @Id
    @Column(name = "IdDivisa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdDivisa() {
        return idDivisa;
    }

    public void setIdDivisa(int idDivisa) {
        this.idDivisa = idDivisa;
    }

    @Basic
    @Column(name = "Clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatTipoDivisa that = (CatTipoDivisa) o;
        return idDivisa == that.idDivisa &&
                Objects.equals(clave, that.clave) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDivisa, clave, descripcion);
    }
}
