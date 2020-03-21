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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 */
@Entity
@Table(name = "nomina")

public class Nomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iduser")
    private Integer iduser;
    @Size(max = 50)
    @Column(name = "salario")
    private String salario;
    @JoinColumn(name = "idcertificado", referencedColumnName = "idcertificado")
    @ManyToOne
    private Certificado idcertificado;
    @JoinColumn(name = "iddesprendible", referencedColumnName = "iddesprendible")
    @ManyToOne
    private Desprendible iddesprendible;
    @JoinColumn(name = "usuario", referencedColumnName = "iduser")
    @OneToOne(optional = false)
    private Usuario usuario;

    public Nomina() {
    }

    public Nomina(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Certificado getIdcertificado() {
        return idcertificado;
    }

    public void setIdcertificado(Certificado idcertificado) {
        this.idcertificado = idcertificado;
    }

    public Desprendible getIddesprendible() {
        return iddesprendible;
    }

    public void setIddesprendible(Desprendible iddesprendible) {
        this.iddesprendible = iddesprendible;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nomina)) {
            return false;
        }
        Nomina other = (Nomina) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Nomina [iduser=" + iduser + "]";
	}

   
    
}
