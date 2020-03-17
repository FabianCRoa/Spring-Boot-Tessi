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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "notificacion")
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnotificacion")
    private Integer idnotificacion;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idnotificacion")
    private Collection<Desprendible> desprendibleCollection;
    @OneToMany(mappedBy = "idnotificacion")
    private Collection<Certificado> certificadoCollection;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne
    private Usuario iduser;
    @JoinColumn(name = "idtipo_notificacion", referencedColumnName = "idtipo_notificacion")
    @ManyToOne
    private TipoNotificacion idtipoNotificacion;

    public Notificacion() {
    }

    public Notificacion(Integer idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public Integer getIdnotificacion() {
        return idnotificacion;
    }

    public void setIdnotificacion(Integer idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<Desprendible> getDesprendibleCollection() {
        return desprendibleCollection;
    }

    public void setDesprendibleCollection(Collection<Desprendible> desprendibleCollection) {
        this.desprendibleCollection = desprendibleCollection;
    }

    public Collection<Certificado> getCertificadoCollection() {
        return certificadoCollection;
    }

    public void setCertificadoCollection(Collection<Certificado> certificadoCollection) {
        this.certificadoCollection = certificadoCollection;
    }

    public Usuario getIduser() {
        return iduser;
    }

    public void setIduser(Usuario iduser) {
        this.iduser = iduser;
    }

    public TipoNotificacion getIdtipoNotificacion() {
        return idtipoNotificacion;
    }

    public void setIdtipoNotificacion(TipoNotificacion idtipoNotificacion) {
        this.idtipoNotificacion = idtipoNotificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotificacion != null ? idnotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.idnotificacion == null && other.idnotificacion != null) || (this.idnotificacion != null && !this.idnotificacion.equals(other.idnotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Notificacion[ idnotificacion=" + idnotificacion + " ]";
    }
    
}
