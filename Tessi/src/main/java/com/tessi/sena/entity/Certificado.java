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
@Table(name = "certificado")
public class Certificado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcertificado")
    private Integer idcertificado;
    @Column(name = "fecha_solicitud")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitud;
    @Column(name = "fecha_respuesta")
    @Temporal(TemporalType.DATE)
    private Date fechaRespuesta;
    @Size(max = 50)
    @Column(name = "periodo_certificado")
    private String periodoCertificado;
    @Column(name = "idaprobador")
    private Integer idaprobador;
    @Column(name = "iduser")
    private Integer iduser;
    @Size(max = 50)
    @Column(name = "estado_cert")
    private String estadoCert;
    @JoinColumn(name = "idnotificacion", referencedColumnName = "idnotificacion")
    @ManyToOne
    private Notificacion idnotificacion;
    @OneToMany(mappedBy = "idcertificado")
    private Collection<Nomina> nominaCollection;

    public Certificado() {
    }

    public Certificado(Integer idcertificado) {
        this.idcertificado = idcertificado;
    }

    public Integer getIdcertificado() {
        return idcertificado;
    }

    public void setIdcertificado(Integer idcertificado) {
        this.idcertificado = idcertificado;
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

    public String getPeriodoCertificado() {
        return periodoCertificado;
    }

    public void setPeriodoCertificado(String periodoCertificado) {
        this.periodoCertificado = periodoCertificado;
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

    public String getEstadoCert() {
        return estadoCert;
    }

    public void setEstadoCert(String estadoCert) {
        this.estadoCert = estadoCert;
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
        hash += (idcertificado != null ? idcertificado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Certificado)) {
            return false;
        }
        Certificado other = (Certificado) object;
        if ((this.idcertificado == null && other.idcertificado != null) || (this.idcertificado != null && !this.idcertificado.equals(other.idcertificado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Certificado[ idcertificado=" + idcertificado + " ]";
    }
    
}
