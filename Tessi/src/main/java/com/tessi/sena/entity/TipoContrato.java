/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tessi.sena.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "tipo_contrato")
public class TipoContrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipocontrato")
    private Integer idtipocontrato;
    @Size(max = 50)
    @Column(name = "nombrecontrato")
    private String nombrecontrato;
    @OneToMany(mappedBy = "idtipocontrato")
    private Collection<Usuario> usuarioCollection;

    public TipoContrato() {
    }

    public TipoContrato(Integer idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public Integer getIdtipocontrato() {
        return idtipocontrato;
    }

    public void setIdtipocontrato(Integer idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public String getNombrecontrato() {
        return nombrecontrato;
    }

    public void setNombrecontrato(String nombrecontrato) {
        this.nombrecontrato = nombrecontrato;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocontrato != null ? idtipocontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoContrato)) {
            return false;
        }
        TipoContrato other = (TipoContrato) object;
        if ((this.idtipocontrato == null && other.idtipocontrato != null) || (this.idtipocontrato != null && !this.idtipocontrato.equals(other.idtipocontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.TipoContrato[ idtipocontrato=" + idtipocontrato + " ]";
    }
    
}
