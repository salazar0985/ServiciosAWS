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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author IDEX1407
 */
@Entity
@Table(name = "SolicitudServicio")
@NamedQueries({
    @NamedQuery(name = "SolicitudServicio.findAll", query = "SELECT s FROM SolicitudServicio s")})
public class SolicitudServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSolicitudServicio")
    private Integer idSolicitudServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdServicio")
    private int idServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdEstatusSolicitud")
    private int idEstatusSolicitud;
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "Activo")
    private Boolean activo;

    public SolicitudServicio() {
    }

    public SolicitudServicio(Integer idSolicitudServicio) {
        this.idSolicitudServicio = idSolicitudServicio;
    }

    public SolicitudServicio(Integer idSolicitudServicio, int idUsuario, int idServicio, int idEstatusSolicitud) {
        this.idSolicitudServicio = idSolicitudServicio;
        this.idUsuario = idUsuario;
        this.idServicio = idServicio;
        this.idEstatusSolicitud = idEstatusSolicitud;
    }

    public Integer getIdSolicitudServicio() {
        return idSolicitudServicio;
    }

    public void setIdSolicitudServicio(Integer idSolicitudServicio) {
        this.idSolicitudServicio = idSolicitudServicio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdEstatusSolicitud() {
        return idEstatusSolicitud;
    }

    public void setIdEstatusSolicitud(int idEstatusSolicitud) {
        this.idEstatusSolicitud = idEstatusSolicitud;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
        hash += (idSolicitudServicio != null ? idSolicitudServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudServicio)) {
            return false;
        }
        SolicitudServicio other = (SolicitudServicio) object;
        if ((this.idSolicitudServicio == null && other.idSolicitudServicio != null) || (this.idSolicitudServicio != null && !this.idSolicitudServicio.equals(other.idSolicitudServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.SolicitudServicio[ idSolicitudServicio=" + idSolicitudServicio + " ]";
    }
    
}
