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
@Table(name = "Estados")
@NamedQueries({
    @NamedQuery(name = "Estados.findAll", query = "SELECT e FROM Estados e")})
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Idestado")
    private Integer idestado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DcEstado")
    private String dcEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CveLocalidad_INEGI")
    private String cveLocalidadINEGI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DcLocalidad_INEGI")
    private String dcLocalidadINEGI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Cp")
    private String cp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DcMunicipio")
    private String dcMunicipio;
    @Size(max = 16)
    @Column(name = "CveColonia")
    private String cveColonia;

    public Estados() {
    }

    public Estados(Integer id) {
        this.id = id;
    }

    public Estados(Integer id, String dcEstado, String cveLocalidadINEGI, String dcLocalidadINEGI, String cp, String dcMunicipio) {
        this.id = id;
        this.dcEstado = dcEstado;
        this.cveLocalidadINEGI = cveLocalidadINEGI;
        this.dcLocalidadINEGI = dcLocalidadINEGI;
        this.cp = cp;
        this.dcMunicipio = dcMunicipio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public String getDcEstado() {
        return dcEstado;
    }

    public void setDcEstado(String dcEstado) {
        this.dcEstado = dcEstado;
    }

    public String getCveLocalidadINEGI() {
        return cveLocalidadINEGI;
    }

    public void setCveLocalidadINEGI(String cveLocalidadINEGI) {
        this.cveLocalidadINEGI = cveLocalidadINEGI;
    }

    public String getDcLocalidadINEGI() {
        return dcLocalidadINEGI;
    }

    public void setDcLocalidadINEGI(String dcLocalidadINEGI) {
        this.dcLocalidadINEGI = dcLocalidadINEGI;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getDcMunicipio() {
        return dcMunicipio;
    }

    public void setDcMunicipio(String dcMunicipio) {
        this.dcMunicipio = dcMunicipio;
    }

    public String getCveColonia() {
        return cveColonia;
    }

    public void setCveColonia(String cveColonia) {
        this.cveColonia = cveColonia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.Estados[ id=" + id + " ]";
    }
    
}
