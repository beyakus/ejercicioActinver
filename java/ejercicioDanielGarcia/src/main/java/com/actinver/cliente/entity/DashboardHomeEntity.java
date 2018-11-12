package com.actinver.cliente.entity;

import javax.persistence.Entity;

@Entity
public class DashboardHomeEntity {

	private Long id;
	private String nombreSeccion;
	private String imagenUrl;
	private int nivel;
	
	public DashboardHomeEntity () {}

	public DashboardHomeEntity(String nombreSeccion, String imagenUrl, int nivel) {
		super();
		this.nombreSeccion = nombreSeccion;
		this.imagenUrl = imagenUrl;
		this.nivel = nivel;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreSeccion() {
		return nombreSeccion;
	}

	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "DashboardHomeEntity [id=" + id + ", nombreSeccion=" + nombreSeccion + ", imagenUrl=" + imagenUrl
				+ ", nivel=" + nivel + "]";
	}
	
	
	
}
