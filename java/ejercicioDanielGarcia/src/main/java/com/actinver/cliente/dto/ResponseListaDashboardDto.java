package com.actinver.cliente.dto;

public class ResponseListaDashboardDto {

	private String nombreSeccion;
	private String img;
	
	public ResponseListaDashboardDto() {}
	
	public ResponseListaDashboardDto(String nombreSeccion, String img) {
		this.nombreSeccion = nombreSeccion;
		this.img = img;
	}

	public String getNombreSeccion() {
		return nombreSeccion;
	}

	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
