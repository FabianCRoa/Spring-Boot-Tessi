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
@Table(name = "pausa")
public class Pausa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpausa")
    private Integer idpausa;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora_iniciopausa")
    @Temporal(TemporalType.TIME)
    private Date horaIniciopausa;
    @Column(name = "hora_finpausa")
    @Temporal(TemporalType.TIME)
    private Date horaFinpausa;
    @Column(name = "tiempopausa_min")
    private Integer tiempopausaMin;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idpausa")
    private Collection<Adherencia> adherenciaCollection;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne
    private Usuario iduser;
    @JoinColumn(name = "idtipo_pausa", referencedColumnName = "idtipo_pausa")
    @ManyToOne
    private TipoPausa idtipoPausa;

    public Pausa() {
    }

    public Pausa(Integer idpausa) {
        this.idpausa = idpausa;
    }

    public Integer getIdpausa() {
        return idpausa;
    }

    public void setIdpausa(Integer idpausa) {
        this.idpausa = idpausa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraIniciopausa() {
        return horaIniciopausa;
    }

    public void setHoraIniciopausa(Date horaIniciopausa) {
        this.horaIniciopausa = horaIniciopausa;
    }

    public Date getHoraFinpausa() {
        return horaFinpausa;
    }

    public void setHoraFinpausa(Date horaFinpausa) {
        this.horaFinpausa = horaFinpausa;
    }

    public Integer getTiempopausaMin() {
        return tiempopausaMin;
    }

    public void setTiempopausaMin(Integer tiempopausaMin) {
        this.tiempopausaMin = tiempopausaMin;
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

    public TipoPausa getIdtipoPausa() {
        return idtipoPausa;
    }

    public void setIdtipoPausa(TipoPausa idtipoPausa) {
        this.idtipoPausa = idtipoPausa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpausa != null ? idpausa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pausa)) {
            return false;
        }
        Pausa other = (Pausa) object;
        if ((this.idpausa == null && other.idpausa != null) || (this.idpausa != null && !this.idpausa.equals(other.idpausa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Pausa[ idpausa=" + idpausa + " ]";
    }
    
}
