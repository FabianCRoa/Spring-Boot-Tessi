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
@Table(name = "tipo_documento")
public class TipoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_documento")
    private Integer idtipoDocumento;
    @Size(max = 50)
    @Column(name = "nom_tipo")
    private String nomTipo;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idtipoDocumento")
    private Collection<Usuario> usuarioCollection;

    public TipoDocumento() {
    }

    public TipoDocumento(Integer idtipoDocumento) {
        this.idtipoDocumento = idtipoDocumento;
    }

    public Integer getIdtipoDocumento() {
        return idtipoDocumento;
    }

    public void setIdtipoDocumento(Integer idtipoDocumento) {
        this.idtipoDocumento = idtipoDocumento;
    }

    public String getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        hash += (idtipoDocumento != null ? idtipoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumento)) {
            return false;
        }
        TipoDocumento other = (TipoDocumento) object;
        if ((this.idtipoDocumento == null && other.idtipoDocumento != null) || (this.idtipoDocumento != null && !this.idtipoDocumento.equals(other.idtipoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.TipoDocumento[ idtipoDocumento=" + idtipoDocumento + " ]";
    }
    
}
