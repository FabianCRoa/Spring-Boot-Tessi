/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tessi.sena.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "novedad")
public class Novedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnovedad")
    private Integer idnovedad;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "tiempo_novedad_min")
    private Integer tiempoNovedadMin;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idnovedad")
    private Collection<Adherencia> adherenciaCollection;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne
    private Usuario iduser;
    @JoinColumn(name = "idtipo_novedad", referencedColumnName = "idtipo_novedad")
    @ManyToOne
    private TipoNovedad idtipoNovedad;

    public Novedad() {
    }

    public Novedad(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public Integer getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTiempoNovedadMin() {
        return tiempoNovedadMin;
    }

    public void setTiempoNovedadMin(Integer tiempoNovedadMin) {
        this.tiempoNovedadMin = tiempoNovedadMin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<Adherencia> getAdherenciaCollection() {
        return adherenciaCollection;
    }

    public void setAdherenciaCollection(Collection<Adherencia> adherenciaCollection) {
        this.adherenciaCollection = adherenciaCollection;
    }

    public Usuario getIduser() {
        return iduser;
    }

    public void setIduser(Usuario iduser) {
        this.iduser = iduser;
    }

    public TipoNovedad getIdtipoNovedad() {
        return idtipoNovedad;
    }

    public void setIdtipoNovedad(TipoNovedad idtipoNovedad) {
        this.idtipoNovedad = idtipoNovedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnovedad != null ? idnovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedad)) {
            return false;
        }
        Novedad other = (Novedad) object;
        if ((this.idnovedad == null && other.idnovedad != null) || (this.idnovedad != null && !this.idnovedad.equals(other.idnovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Novedad[ idnovedad=" + idnovedad + " ]";
    }
    
}
