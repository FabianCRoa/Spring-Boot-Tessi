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
@Table(name = "tipo_novedad")

public class TipoNovedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_novedad")
    private Integer idtipoNovedad;
    @Size(max = 50)
    @Column(name = "nombre_novedad")
    private String nombreNovedad;
    @OneToMany(mappedBy = "idtipoNovedad")
    private Collection<Novedad> novedadCollection;

    public TipoNovedad() {
    }

    public TipoNovedad(Integer idtipoNovedad) {
        this.idtipoNovedad = idtipoNovedad;
    }

    public Integer getIdtipoNovedad() {
        return idtipoNovedad;
    }

    public void setIdtipoNovedad(Integer idtipoNovedad) {
        this.idtipoNovedad = idtipoNovedad;
    }

    public String getNombreNovedad() {
        return nombreNovedad;
    }

    public void setNombreNovedad(String nombreNovedad) {
        this.nombreNovedad = nombreNovedad;
    }

    
    public Collection<Novedad> getNovedadCollection() {
        return novedadCollection;
    }

    public void setNovedadCollection(Collection<Novedad> novedadCollection) {
        this.novedadCollection = novedadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoNovedad != null ? idtipoNovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoNovedad)) {
            return false;
        }
        TipoNovedad other = (TipoNovedad) object;
        if ((this.idtipoNovedad == null && other.idtipoNovedad != null) || (this.idtipoNovedad != null && !this.idtipoNovedad.equals(other.idtipoNovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.TipoNovedad[ idtipoNovedad=" + idtipoNovedad + " ]";
    }
    
}