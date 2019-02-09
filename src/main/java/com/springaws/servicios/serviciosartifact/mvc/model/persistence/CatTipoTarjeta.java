/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author pimen
 */
@Entity
@Table(name = "Cat_TipoTarjeta")
@NamedQueries({
    @NamedQuery(name = "CatTipoTarjeta.findAll", query = "SELECT c FROM CatTipoTarjeta c")})
public class CatTipoTarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTipoTarjeta")
    private Integer idTipoTarjeta;
    @Size(max = 50)
    @Column(name = "Clave")
    private String clave;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idTipoTarjeta", fetch = FetchType.LAZY)
    private List<Tarjeta> tarjetaList;

    public CatTipoTarjeta() {
    }

    public CatTipoTarjeta(Integer idTipoTarjeta) {
        this.idTipoTarjeta = idTipoTarjeta;
    }

    public Integer getIdTipoTarjeta() {
        return idTipoTarjeta;
    }

    public void setIdTipoTarjeta(Integer idTipoTarjeta) {
        this.idTipoTarjeta = idTipoTarjeta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarjeta> getTarjetaList() {
        return tarjetaList;
    }

    public void setTarjetaList(List<Tarjeta> tarjetaList) {
        this.tarjetaList = tarjetaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoTarjeta != null ? idTipoTarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoTarjeta)) {
            return false;
        }
        CatTipoTarjeta other = (CatTipoTarjeta) object;
        if ((this.idTipoTarjeta == null && other.idTipoTarjeta != null) || (this.idTipoTarjeta != null && !this.idTipoTarjeta.equals(other.idTipoTarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoTarjeta[ idTipoTarjeta=" + idTipoTarjeta + " ]";
    }
    
}
