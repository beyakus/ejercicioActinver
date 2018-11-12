package com.actinver.cliente.entity;

import org.springframework.stereotype.Repository;

@Repository
public class ListaSaldoEntity {
	
	private int id;
	private  int noCliente;
	private String nombre;
	private String razonSocial;
	private float saldoTotal;
	private float saldoActual;
	private float pendientePorPagar;
	
	public ListaSaldoEntity() {}

	public ListaSaldoEntity(int id, int noCliente, String nombre, String razonSocial, float saldoTotal,
			float saldoActual, float pendientePorPagar) {
		super();
		this.id = id;
		this.noCliente = noCliente;
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.saldoTotal = saldoTotal;
		this.saldoActual = saldoActual;
		this.pendientePorPagar = pendientePorPagar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(int noCliente) {
		this.noCliente = noCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public float getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(float saldoActual) {
		this.saldoActual = saldoActual;
	}

	public float getPendientePorPagar() {
		return pendientePorPagar;
	}

	public void setPendientePorPagar(float pendientePorPagar) {
		this.pendientePorPagar = pendientePorPagar;
	}

}
