/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tessi.sena.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "adherencia")
	public class Adherencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idadherencia")
    private Integer idadherencia;
    @Column(name = "horaingreso")
    private Integer horaingreso;
    @Column(name = "horasalida")
    private Integer horasalida;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idnovedad", referencedColumnName = "idnovedad")
    @ManyToOne
    private Novedad idnovedad;
    @JoinColumn(name = "idpausa", referencedColumnName = "idpausa")
    @ManyToOne
    private Pausa idpausa;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne
    private Usuario iduser;

    public Adherencia() {
    }

    public Adherencia(Integer idadherencia) {
        this.idadherencia = idadherencia;
    }

    public Integer getIdadherencia() {
        return idadherencia;
    }

    public void setIdadherencia(Integer idadherencia) {
        this.idadherencia = idadherencia;
    }

    public Integer getHoraingreso() {
        return horaingreso;
    }

    public void setHoraingreso(Integer horaingreso) {
        this.horaingreso = horaingreso;
    }

    public Integer getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Integer horasalida) {
        this.horasalida = horasalida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Novedad getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(Novedad idnovedad) {
        this.idnovedad = idnovedad;
    }

    public Pausa getIdpausa() {
        return idpausa;
    }

    public void setIdpausa(Pausa idpausa) {
        this.idpausa = idpausa;
    }

    public Usuario getIduser() {
        return iduser;
    }

    public void setIduser(Usuario iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadherencia != null ? idadherencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adherencia)) {
            return false;
        }
        Adherencia other = (Adherencia) object;
        if ((this.idadherencia == null && other.idadherencia != null) || (this.idadherencia != null && !this.idadherencia.equals(other.idadherencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Adherencia[ idadherencia=" + idadherencia + " ]";
    }
    
}
