package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;

/**
 * Created by IDEX1010 on 19/02/2019.
 */
@Entity
@Table(name = "Cat_FormaPago", schema = "", catalog = "Servicios")
public class CatFormaPagoEntity {
    private int idFormaPago;
    private String clave;
    private String descripcion;

    @Id
    @Column(name = "IdFormaPago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
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

        CatFormaPagoEntity that = (CatFormaPagoEntity) o;

        if (idFormaPago != that.idFormaPago) return false;
        if (clave != null ? !clave.equals(that.clave) : that.clave != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormaPago;
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
