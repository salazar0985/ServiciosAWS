package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;

/**
 * Created by IDEX1010 on 19/02/2019.
 */
@Entity
@Table(name = "Cat_TipoDato", schema = "", catalog = "Servicios")
public class CatTipoDatoEntity {
    private int idTipoDato;
    private String clave;
    private String descripcion;

    @Id
    @Column(name = "IdTipoDato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdTipoDato() {
        return idTipoDato;
    }

    public void setIdTipoDato(int idTipoDato) {
        this.idTipoDato = idTipoDato;
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

        CatTipoDatoEntity that = (CatTipoDatoEntity) o;

        if (idTipoDato != that.idTipoDato) return false;
        if (clave != null ? !clave.equals(that.clave) : that.clave != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoDato;
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
