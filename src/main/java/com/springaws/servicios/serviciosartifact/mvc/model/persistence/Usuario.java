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
@Table(name = "Usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {

    @Size(max = 50)
    @Column(name = "Usuario")
    private String usuario;
    @Size(max = 50)
    @Column(name = "Contrasenia")
    private String contrasenia;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "FechaActualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @Column(name = "Activo")
    private Boolean activo;
    @JoinColumn(name = "IdDatosUsr", referencedColumnName = "IdDatosUsr")
    @ManyToOne(fetch = FetchType.LAZY)
    private DatosUsuario idDatosUsr;
    @JoinColumn(name = "IdRol", referencedColumnName = "IdRol")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rol idRol;
    @OneToMany(mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<DatosBanc> datosBancList;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public DatosUsuario getIdDatosUsr() {
        return idDatosUsr;
    }

    public void setIdDatosUsr(DatosUsuario idDatosUsr) {
        this.idDatosUsr = idDatosUsr;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    public List<DatosBanc> getDatosBancList() {
        return datosBancList;
    }

    public void setDatosBancList(List<DatosBanc> datosBancList) {
        this.datosBancList = datosBancList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.Usuario[ idUsuario=" + idUsuario + " ]";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
