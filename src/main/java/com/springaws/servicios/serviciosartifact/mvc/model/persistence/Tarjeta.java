/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author pimen
 */
@Entity
@Table(name = "Tarjeta")
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t")})
public class Tarjeta implements Serializable {

    @Size(max = 25)
    @Column(name = "NumeroTarjeta")
    private String numeroTarjeta;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTarjeta")
    private Integer idTarjeta;
    @Column(name = "FechaExpiracion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;
    @Column(name = "Activo")
    private Boolean activo;
    @JoinColumn(name = "IdDatosBanc", referencedColumnName = "IdDatosBanc")
    @ManyToOne(fetch = FetchType.LAZY)
    private DatosBanc idDatosBanc;
    @JoinColumn(name = "IdTipoTarjeta", referencedColumnName = "IdTipoTarjeta")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatTipoTarjeta idTipoTarjeta;

    public Tarjeta() {
    }

    public Tarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }


    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public DatosBanc getIdDatosBanc() {
        return idDatosBanc;
    }

    public void setIdDatosBanc(DatosBanc idDatosBanc) {
        this.idDatosBanc = idDatosBanc;
    }

    public CatTipoTarjeta getIdTipoTarjeta() {
        return idTipoTarjeta;
    }

    public void setIdTipoTarjeta(CatTipoTarjeta idTipoTarjeta) {
        this.idTipoTarjeta = idTipoTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarjeta != null ? idTarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.idTarjeta == null && other.idTarjeta != null) || (this.idTarjeta != null && !this.idTarjeta.equals(other.idTarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.Tarjeta[ idTarjeta=" + idTarjeta + " ]";
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
}
