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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "stock")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstock")
    private Integer idstock;
    @Size(max = 50)
    @Column(name = "placa_inventario")
    private String placaInventario;
    @Lob
    @Size(max = 65535)
    @Column(name = "licencias")
    private String licencias;
    @Column(name = "idsuministro")
    private Integer idsuministro;
    @JoinColumn(name = "idmarca", referencedColumnName = "idmarca")
    @ManyToOne
    private Marca idmarca;
    @JoinColumn(name = "idproveedor", referencedColumnName = "idproveedor")
    @ManyToOne
    private Proveedor idproveedor;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne
    private Usuario iduser;

    public Stock() {
    }

    public Stock(Integer idstock) {
        this.idstock = idstock;
    }

    public Integer getIdstock() {
        return idstock;
    }

    public void setIdstock(Integer idstock) {
        this.idstock = idstock;
    }

    public String getPlacaInventario() {
        return placaInventario;
    }

    public void setPlacaInventario(String placaInventario) {
        this.placaInventario = placaInventario;
    }

    public String getLicencias() {
        return licencias;
    }

    public void setLicencias(String licencias) {
        this.licencias = licencias;
    }

    public Integer getIdsuministro() {
        return idsuministro;
    }

    public void setIdsuministro(Integer idsuministro) {
        this.idsuministro = idsuministro;
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

    public Usuario getIduser() {
        return iduser;
    }

    public void setIduser(Usuario iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstock != null ? idstock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idstock == null && other.idstock != null) || (this.idstock != null && !this.idstock.equals(other.idstock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Stock[ idstock=" + idstock + " ]";
    }
    
}
