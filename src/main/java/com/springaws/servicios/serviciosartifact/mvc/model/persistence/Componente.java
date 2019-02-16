/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author pimen
 */
@Entity
@Table(name = "Componente")
@NamedQueries({
    @NamedQuery(name = "Componente.findAll", query = "SELECT c FROM Componente c")})
public class Componente implements Serializable {

    @Size(max = 50)
    @Column(name = "Clave")
    private String clave;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdComponente")
    private Integer idComponente;
    @Column(name = "IdRol")
    private Integer idRol;
    @Column(name = "Activo")
    private Boolean activo;

    public Componente() {
    }

    public Componente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }


    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComponente != null ? idComponente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componente)) {
            return false;
        }
        Componente other = (Componente) object;
        if ((this.idComponente == null && other.idComponente != null) || (this.idComponente != null && !this.idComponente.equals(other.idComponente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.Componente[ idComponente=" + idComponente + " ]";
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
    
}
