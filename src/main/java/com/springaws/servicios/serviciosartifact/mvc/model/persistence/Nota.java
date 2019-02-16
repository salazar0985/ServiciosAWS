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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author IDEX1407
 */
@Entity
@Table(name = "Nota")
@NamedQueries({
    @NamedQuery(name = "Nota.findAll", query = "SELECT n FROM Nota n")})
public class Nota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdNota")
    private Integer idNota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdSolicitudServicio")
    private int idSolicitudServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdFormaPago")
    private int idFormaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdEstatusNota")
    private int idEstatusNota;
    @Size(max = 50)
    @Column(name = "Importe")
    private String importe;
    @Size(max = 50)
    @Column(name = "Abono")
    private String abono;
    @Size(max = 50)
    @Column(name = "Cargo")
    private String cargo;
    @Column(name = "Activo")
    private Boolean activo;

    public Nota() {
    }

    public Nota(Integer idNota) {
        this.idNota = idNota;
    }

    public Nota(Integer idNota, int idSolicitudServicio, int idFormaPago, int idEstatusNota) {
        this.idNota = idNota;
        this.idSolicitudServicio = idSolicitudServicio;
        this.idFormaPago = idFormaPago;
        this.idEstatusNota = idEstatusNota;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public int getIdSolicitudServicio() {
        return idSolicitudServicio;
    }

    public void setIdSolicitudServicio(int idSolicitudServicio) {
        this.idSolicitudServicio = idSolicitudServicio;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public int getIdEstatusNota() {
        return idEstatusNota;
    }

    public void setIdEstatusNota(int idEstatusNota) {
        this.idEstatusNota = idEstatusNota;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getAbono() {
        return abono;
    }

    public void setAbono(String abono) {
        this.abono = abono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        hash += (idNota != null ? idNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nota)) {
            return false;
        }
        Nota other = (Nota) object;
        if ((this.idNota == null && other.idNota != null) || (this.idNota != null && !this.idNota.equals(other.idNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.Nota[ idNota=" + idNota + " ]";
    }
    
}
