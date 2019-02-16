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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DatosUsuario")
@NamedQueries({
    @NamedQuery(name = "DatosUsuario.findAll", query = "SELECT d FROM DatosUsuario d")})
public class DatosUsuario implements Serializable {

    @Size(max = 150)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 150)
    @Column(name = "Paterno")
    private String paterno;
    @Size(max = 150)
    @Column(name = "Materno")
    private String materno;
    @Size(max = 150)
    @Column(name = "Denominacion")
    private String denominacion;
    @Size(max = 13)
    @Column(name = "Rfc")
    private String rfc;
    @Size(max = 18)
    @Column(name = "Curp")
    private String curp;
    @Size(max = 20)
    @Column(name = "Telefono")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "Email")
    private String email;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDatosUsr")
    private Integer idDatosUsr;
    @Column(name = "Activo")
    private Boolean activo;
    @OneToMany(mappedBy = "idDatosUsr", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;
    @JoinColumn(name = "IdDomicilio", referencedColumnName = "IdDomicilio")
    @ManyToOne(fetch = FetchType.LAZY)
    private Domicilio idDomicilio;

    public DatosUsuario() {
    }

    public DatosUsuario(Integer idDatosUsr) {
        this.idDatosUsr = idDatosUsr;
    }

    public Integer getIdDatosUsr() {
        return idDatosUsr;
    }

    public void setIdDatosUsr(Integer idDatosUsr) {
        this.idDatosUsr = idDatosUsr;
    }


    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public Domicilio getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Domicilio idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosUsr != null ? idDatosUsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosUsuario)) {
            return false;
        }
        DatosUsuario other = (DatosUsuario) object;
        if ((this.idDatosUsr == null && other.idDatosUsr != null) || (this.idDatosUsr != null && !this.idDatosUsr.equals(other.idDatosUsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.DatosUsuario[ idDatosUsr=" + idDatosUsr + " ]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
