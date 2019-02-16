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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author pimen
 */
@Entity
@Table(name = "Demo")
@NamedQueries({
    @NamedQuery(name = "Demo.findAll", query = "SELECT d FROM Demo d")})
public class Demo implements Serializable {

    @Size(max = 45)
    @Column(name = "Nombre")
    private String nombre;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDemo")
    private Integer idDemo;

    public Demo() {
    }

    public Demo(Integer idDemo) {
        this.idDemo = idDemo;
    }

    public Integer getIdDemo() {
        return idDemo;
    }

    public void setIdDemo(Integer idDemo) {
        this.idDemo = idDemo;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDemo != null ? idDemo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demo)) {
            return false;
        }
        Demo other = (Demo) object;
        if ((this.idDemo == null && other.idDemo != null) || (this.idDemo != null && !this.idDemo.equals(other.idDemo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springaws.servicios.serviciosartifact.mvc.model.persistence.Demo[ idDemo=" + idDemo + " ]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
