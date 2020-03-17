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
@Table(name = "desprendible")
public class Desprendible implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddesprendible")
    private Integer iddesprendible;
    @Column(name = "fecha_solicitud")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitud;
    @Column(name = "fecha_respuesta")
    @Temporal(TemporalType.DATE)
    private Date fechaRespuesta;
    @Column(name = "periodo_desprendible")
    @Temporal(TemporalType.DATE)
    private Date periodoDesprendible;
    @Column(name = "idaprobador")
    private Integer idaprobador;
    @Column(name = "iduser")
    private Integer iduser;
    @Size(max = 50)
    @Column(name = "estado_desp")
    private String estadoDesp;
    @JoinColumn(name = "idnotificacion", referencedColumnName = "idnotificacion")
    @ManyToOne
    private Notificacion idnotificacion;
    @OneToMany(mappedBy = "iddesprendible")
    private Collection<Nomina> nominaCollection;

    public Desprendible() {
    }

    public Desprendible(Integer iddesprendible) {
        this.iddesprendible = iddesprendible;
    }

    public Integer getIddesprendible() {
        return iddesprendible;
    }

    public void setIddesprendible(Integer iddesprendible) {
        this.iddesprendible = iddesprendible;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public Date getPeriodoDesprendible() {
        return periodoDesprendible;
    }

    public void setPeriodoDesprendible(Date periodoDesprendible) {
        this.periodoDesprendible = periodoDesprendible;
    }

    public Integer getIdaprobador() {
        return idaprobador;
    }

    public void setIdaprobador(Integer idaprobador) {
        this.idaprobador = idaprobador;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getEstadoDesp() {
        return estadoDesp;
    }

    public void setEstadoDesp(String estadoDesp) {
        this.estadoDesp = estadoDesp;
    }

    public Notificacion getIdnotificacion() {
        return idnotificacion;
    }

    public void setIdnotificacion(Notificacion idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public Collection<Nomina> getNominaCollection() {
        return nominaCollection;
    }

    public void setNominaCollection(Collection<Nomina> nominaCollection) {
        this.nominaCollection = nominaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddesprendible != null ? iddesprendible.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Desprendible)) {
            return false;
        }
        Desprendible other = (Desprendible) object;
        if ((this.iddesprendible == null && other.iddesprendible != null) || (this.iddesprendible != null && !this.iddesprendible.equals(other.iddesprendible))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Desprendible[ iddesprendible=" + iddesprendible + " ]";
    }
    
}
