/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tessi.sena.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "usuario")
@Component
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native", strategy="native")
    private Integer id;
    @NotNull
    @Column(name = "iduser")
    private Integer iduser;
    @Size(max = 50)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Size(max = 50)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 50)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Size(max = 10)
    @Column(name = "telefono")
    private String telefono;
    @Lob
    @Size(max = 65535)
    @Column(name = "correo")
    private String correo;
    @Size(max = 50)
    @Column(name = "contrasena")
    private String contrasena;
    @Size(max = 50)
    @Column(name = "horario")
    private String horario;
    @Column(name = "codempleado")
    private Integer codempleado;
    @Column(name = "codadmin")
    private Integer codadmin;
    
    
    @OneToMany(mappedBy = "iduser")
    private Collection<Adherencia> adherenciaCollection;
    @OneToMany(mappedBy = "iduser")
    private Collection<Pausa> pausaCollection;
    @OneToMany(mappedBy = "iduser")
    private Collection<Notificacion> notificacionCollection;
    @OneToMany(mappedBy = "iduser")
    private Collection<Novedad> novedadCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Nomina nomina;
    @JoinColumn(name = "idarea", referencedColumnName = "idarea")
    @ManyToOne
    private Area idarea;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne
    private Cargo idcargo;
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    @ManyToOne
    private Rol idrol;
    @JoinColumn(name = "idsede", referencedColumnName = "idsede")
    @ManyToOne
    private Sede idsede;
    @JoinColumn(name = "idtipo_documento", referencedColumnName = "idtipo_documento")
    @ManyToOne
    private TipoDocumento idtipoDocumento;
    @JoinColumn(name = "idtipocontrato", referencedColumnName = "idtipocontrato")
    @ManyToOne
    private TipoContrato idtipocontrato;
    @OneToMany(mappedBy = "iduser")
    private Collection<Stock> stockCollection;
    
    @ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="user_roles"
		,joinColumns=@JoinColumn(name="id")
		,inverseJoinColumns=@JoinColumn(name="idrol"))
	
    private Set<Rol> roles;
        
    public Usuario() {
    super();	
    }
    
    public Usuario(@NotNull Integer id) {
		super();
		this.id = id;
	}

	
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Integer getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(Integer codempleado) {
		this.codempleado = codempleado;
	}

	public Integer getCodadmin() {
		return codadmin;
	}

	public void setCodadmin(Integer codadmin) {
		this.codadmin = codadmin;
	}

	public Collection<Adherencia> getAdherenciaCollection() {
		return adherenciaCollection;
	}

	public void setAdherenciaCollection(Collection<Adherencia> adherenciaCollection) {
		this.adherenciaCollection = adherenciaCollection;
	}

	public Collection<Pausa> getPausaCollection() {
		return pausaCollection;
	}

	public void setPausaCollection(Collection<Pausa> pausaCollection) {
		this.pausaCollection = pausaCollection;
	}

	public Collection<Notificacion> getNotificacionCollection() {
		return notificacionCollection;
	}

	public void setNotificacionCollection(Collection<Notificacion> notificacionCollection) {
		this.notificacionCollection = notificacionCollection;
	}

	public Collection<Novedad> getNovedadCollection() {
		return novedadCollection;
	}

	public void setNovedadCollection(Collection<Novedad> novedadCollection) {
		this.novedadCollection = novedadCollection;
	}

	public Nomina getNomina() {
		return nomina;
	}

	public void setNomina(Nomina nomina) {
		this.nomina = nomina;
	}

	public Area getIdarea() {
		return idarea;
	}

	public void setIdarea(Area idarea) {
		this.idarea = idarea;
	}

	public Cargo getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(Cargo idcargo) {
		this.idcargo = idcargo;
	}

	public Rol getIdrol() {
		return idrol;
	}

	public void setIdrol(Rol idrol) {
		this.idrol = idrol;
	}

	public Sede getIdsede() {
		return idsede;
	}

	public void setIdsede(Sede idsede) {
		this.idsede = idsede;
	}

	public TipoDocumento getIdtipoDocumento() {
		return idtipoDocumento;
	}

	public void setIdtipoDocumento(TipoDocumento idtipoDocumento) {
		this.idtipoDocumento = idtipoDocumento;
	}

	public TipoContrato getIdtipocontrato() {
		return idtipocontrato;
	}

	public void setIdtipocontrato(TipoContrato idtipocontrato) {
		this.idtipocontrato = idtipocontrato;
	}

	public Collection<Stock> getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(Collection<Stock> stockCollection) {
        this.stockCollection = stockCollection;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iduser == null) ? 0 : iduser.hashCode());
		result = prime * result + ((adherenciaCollection == null) ? 0 : adherenciaCollection.hashCode());
		result = prime * result + ((codadmin == null) ? 0 : codadmin.hashCode());
		result = prime * result + ((codempleado == null) ? 0 : codempleado.hashCode());
		result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + ((idarea == null) ? 0 : idarea.hashCode());
		result = prime * result + ((idcargo == null) ? 0 : idcargo.hashCode());
		result = prime * result + ((idrol == null) ? 0 : idrol.hashCode());
		result = prime * result + ((idsede == null) ? 0 : idsede.hashCode());
		result = prime * result + ((idtipoDocumento == null) ? 0 : idtipoDocumento.hashCode());
		result = prime * result + ((idtipocontrato == null) ? 0 : idtipocontrato.hashCode());
		result = prime * result + ((nomina == null) ? 0 : nomina.hashCode());
		result = prime * result + ((notificacionCollection == null) ? 0 : notificacionCollection.hashCode());
		result = prime * result + ((novedadCollection == null) ? 0 : novedadCollection.hashCode());
		result = prime * result + ((pausaCollection == null) ? 0 : pausaCollection.hashCode());
		result = prime * result + ((primerApellido == null) ? 0 : primerApellido.hashCode());
		result = prime * result + ((primerNombre == null) ? 0 : primerNombre.hashCode());
		result = prime * result + ((segundoApellido == null) ? 0 : segundoApellido.hashCode());
		result = prime * result + ((segundoNombre == null) ? 0 : segundoNombre.hashCode());
		result = prime * result + ((stockCollection == null) ? 0 : stockCollection.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (adherenciaCollection == null) {
			if (other.adherenciaCollection != null)
				return false;
		} else if (!adherenciaCollection.equals(other.adherenciaCollection))
			return false;
		if (iduser == null) {
			if (other.iduser != null)
				return false;
		} else if (!iduser.equals(other.iduser))
			return false;
		if (codadmin == null) {
			if (other.codadmin != null)
				return false;
		} else if (!codadmin.equals(other.codadmin))
			return false;
		if (codempleado == null) {
			if (other.codempleado != null)
				return false;
		} else if (!codempleado.equals(other.codempleado))
			return false;
		if (contrasena == null) {
			if (other.contrasena != null)
				return false;
		} else if (!contrasena.equals(other.contrasena))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idarea == null) {
			if (other.idarea != null)
				return false;
		} else if (!idarea.equals(other.idarea))
			return false;
		if (idcargo == null) {
			if (other.idcargo != null)
				return false;
		} else if (!idcargo.equals(other.idcargo))
			return false;
		if (idrol == null) {
			if (other.idrol != null)
				return false;
		} else if (!idrol.equals(other.idrol))
			return false;
		if (idsede == null) {
			if (other.idsede != null)
				return false;
		} else if (!idsede.equals(other.idsede))
			return false;
		if (idtipoDocumento == null) {
			if (other.idtipoDocumento != null)
				return false;
		} else if (!idtipoDocumento.equals(other.idtipoDocumento))
			return false;
		if (idtipocontrato == null) {
			if (other.idtipocontrato != null)
				return false;
		} else if (!idtipocontrato.equals(other.idtipocontrato))
			return false;
		if (nomina == null) {
			if (other.nomina != null)
				return false;
		} else if (!nomina.equals(other.nomina))
			return false;
		if (notificacionCollection == null) {
			if (other.notificacionCollection != null)
				return false;
		} else if (!notificacionCollection.equals(other.notificacionCollection))
			return false;
		if (novedadCollection == null) {
			if (other.novedadCollection != null)
				return false;
		} else if (!novedadCollection.equals(other.novedadCollection))
			return false;
		if (pausaCollection == null) {
			if (other.pausaCollection != null)
				return false;
		} else if (!pausaCollection.equals(other.pausaCollection))
			return false;
		if (primerApellido == null) {
			if (other.primerApellido != null)
				return false;
		} else if (!primerApellido.equals(other.primerApellido))
			return false;
		if (primerNombre == null) {
			if (other.primerNombre != null)
				return false;
		} else if (!primerNombre.equals(other.primerNombre))
			return false;
		if (segundoApellido == null) {
			if (other.segundoApellido != null)
				return false;
		} else if (!segundoApellido.equals(other.segundoApellido))
			return false;
		if (segundoNombre == null) {
			if (other.segundoNombre != null)
				return false;
		} else if (!segundoNombre.equals(other.segundoNombre))
			return false;
		if (stockCollection == null) {
			if (other.stockCollection != null)
				return false;
		} else if (!stockCollection.equals(other.stockCollection))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
    
    
}
