/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tessi.sena.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "suministro")
public class Suministro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsuministro")
    private Integer idsuministro;
    @Size(max = 50)
    @Column(name = "nombre_suministro")
    private String nombreSuministro;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idmarca", referencedColumnName = "idmarca")
    @ManyToOne
    private Marca idmarca;
    @JoinColumn(name = "idproveedor", referencedColumnName = "idproveedor")
    @ManyToOne
    private Proveedor idproveedor;

    public Suministro() {
    }

    public Suministro(Integer idsuministro) {
        this.idsuministro = idsuministro;
    }

    public Integer getIdsuministro() {
        return idsuministro;
    }

    public void setIdsuministro(Integer idsuministro) {
        this.idsuministro = idsuministro;
    }

    public String getNombreSuministro() {
        return nombreSuministro;
    }

    public void setNombreSuministro(String nombreSuministro) {
        this.nombreSuministro = nombreSuministro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Marca getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Marca idmarca) {
        this.idmarca = idmarca;
    }

    public Proveedor getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Proveedor idproveedor) {
        this.idproveedor = idproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsuministro != null ? idsuministro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suministro)) {
            return false;
        }
        Suministro other = (Suministro) object;
        if ((this.idsuministro == null && other.idsuministro != null) || (this.idsuministro != null && !this.idsuministro.equals(other.idsuministro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Suministro[ idsuministro=" + idsuministro + " ]";
    }
    
}
