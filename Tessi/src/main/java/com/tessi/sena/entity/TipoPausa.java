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
@Table(name = "tipo_pausa")
public class TipoPausa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_pausa")
    private Integer idtipoPausa;
    @Size(max = 50)
    @Column(name = "nombre_pausa")
    private String nombrePausa;
    @OneToMany(mappedBy = "idtipoPausa")
    private Collection<Pausa> pausaCollection;

    public TipoPausa() {
    }

    public TipoPausa(Integer idtipoPausa) {
        this.idtipoPausa = idtipoPausa;
    }

    public Integer getIdtipoPausa() {
        return idtipoPausa;
    }

    public void setIdtipoPausa(Integer idtipoPausa) {
        this.idtipoPausa = idtipoPausa;
    }

    public String getNombrePausa() {
        return nombrePausa;
    }

    public void setNombrePausa(String nombrePausa) {
        this.nombrePausa = nombrePausa;
    }

    public Collection<Pausa> getPausaCollection() {
        return pausaCollection;
    }

    public void setPausaCollection(Collection<Pausa> pausaCollection) {
        this.pausaCollection = pausaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoPausa != null ? idtipoPausa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPausa)) {
            return false;
        }
        TipoPausa other = (TipoPausa) object;
        if ((this.idtipoPausa == null && other.idtipoPausa != null) || (this.idtipoPausa != null && !this.idtipoPausa.equals(other.idtipoPausa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.TipoPausa[ idtipoPausa=" + idtipoPausa + " ]";
    }
    
}
