/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author pimen
 */
@Entity
@Table(name = "DatosBanc")
@NamedQueries({
    @NamedQuery(name = "DatosBanc.findAll", query = "SELECT d FROM DatosBanc d")})
public class DatosBanc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDatosBanc")
    private Integer idDatosBanc;
    @Size(max = 200)
    @Column(name = "Titular")
    private String titular;
    @Size(max = 150)
    @Column(name = "Banco")
    private String banco;
    @Size(max = 18)
    @Column(name = "Clabe")
    private String clabe;
    @Size(max = 10)
    @Column(name = "NumCta")
    private String numCta;
    @Size(max = 200)
    @Column(name = "DireccionDom")
    private String direccionDom;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "FechaActualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @Column(name = "Activo")
    private Boolean activo;
    @OneToMany(mappedBy = "idDatosBanc", fetch = FetchType.LAZY)
    private List<Tarjeta> tarjetaList;
    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public DatosBanc() {
    }

    public DatosBanc(Integer idDatosBanc) {
        this.idDatosBanc = idDatosBanc;
    }

    public Integer getIdDatosBanc() {
        return idDatosBanc;
    }

    public void setIdDatosBanc(Integer idDatosBanc) {
        this.idDatosBanc = idDatosBanc;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public String getDireccionDom() {
        return direccionDom;
    }

    public void setDireccionDom(String direccionDom) {
        this.direccionDom = direccionDom;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<Tarjeta> getTarjetaList() {
        return tarjetaList;
    }

    public void setTarjetaList(List<Tarjeta> tarjetaList) {
        this.tarjetaList = tarjetaList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosBanc != null ? idDatosBanc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosBanc)) {
            return false;
        }
        DatosBanc other = (DatosBanc) object;
        if ((this.idDatosBanc == null && other.idDatosBanc != null) || (this.idDatosBanc != null && !this.idDatosBanc.equals(other.idDatosBanc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.DatosBanc[ idDatosBanc=" + idDatosBanc + " ]";
    }
    
}
