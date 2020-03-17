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
@Table(name = "tipo_notificacion")
public class TipoNotificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_notificacion")
    private Integer idtipoNotificacion;
    @Size(max = 50)
    @Column(name = "nombre_notificacion")
    private String nombreNotificacion;
    @OneToMany(mappedBy = "idtipoNotificacion")
    private Collection<Notificacion> notificacionCollection;

    public TipoNotificacion() {
    }

    public TipoNotificacion(Integer idtipoNotificacion) {
        this.idtipoNotificacion = idtipoNotificacion;
    }

    public Integer getIdtipoNotificacion() {
        return idtipoNotificacion;
    }

    public void setIdtipoNotificacion(Integer idtipoNotificacion) {
        this.idtipoNotificacion = idtipoNotificacion;
    }

    public String getNombreNotificacion() {
        return nombreNotificacion;
    }

    public void setNombreNotificacion(String nombreNotificacion) {
        this.nombreNotificacion = nombreNotificacion;
    }

    public Collection<Notificacion> getNotificacionCollection() {
        return notificacionCollection;
    }

    public void setNotificacionCollection(Collection<Notificacion> notificacionCollection) {
        this.notificacionCollection = notificacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoNotificacion != null ? idtipoNotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoNotificacion)) {
            return false;
        }
        TipoNotificacion other = (TipoNotificacion) object;
        if ((this.idtipoNotificacion == null && other.idtipoNotificacion != null) || (this.idtipoNotificacion != null && !this.idtipoNotificacion.equals(other.idtipoNotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.TipoNotificacion[ idtipoNotificacion=" + idtipoNotificacion + " ]";
    }
    
}
