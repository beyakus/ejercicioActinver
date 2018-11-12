package com.actinver.cliente.dto;

public class ResponseTablaDto {
	
	private int id;
	private String nombre;
	private String status;
	private float saldo;
	private float pendiente;
	
	public ResponseTablaDto() {}
	
	public ResponseTablaDto(int id, String nombre, String status, float saldo, float pendiente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.status = status;
		this.saldo = saldo;
		this.pendiente = pendiente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getPendiente() {
		return pendiente;
	}

	public void setPendiente(float pendiente) {
		this.pendiente = pendiente;
	}

}
