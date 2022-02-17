package com.formacionspring.app.appwebmvc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="proyectos")
public class Proyecto implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=50)
	private String nombre;
	@Column(name="fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	@Column(name="fecha_fin")
	@Temporal(TemporalType.DATE)
	private Date fechaFin;
	@Column(name="fecha_activo")
	@Temporal(TemporalType.DATE)
	private Date fechaActivo;
	
	

	public Long getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public Date getFechaInicio() {
		return fechaInicio;
	}



	public Date getFechaFin() {
		return fechaFin;
	}



	public Date getFechaActivo() {
		return fechaActivo;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}



	public void setFechaActivo(Date fechaActivo) {
		this.fechaActivo = fechaActivo;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
