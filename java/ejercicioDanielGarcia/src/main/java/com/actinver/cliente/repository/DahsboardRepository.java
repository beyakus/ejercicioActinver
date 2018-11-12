package com.actinver.cliente.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.actinver.cliente.entity.DashboardHomeEntity;
import com.actinver.cliente.entity.ListaSaldoEntity;

@Repository
public class DahsboardRepository {
	
	public  List<DashboardHomeEntity>getobtieneSecciones() throws Exception{
		List<DashboardHomeEntity> list = new ArrayList<DashboardHomeEntity>();
		list.add(new DashboardHomeEntity("Consulta de Saldos","assets/img/saldos.jpg",1));
		list.add(new DashboardHomeEntity("Consulta de Créditos","assets/img/creditos.jpg",1));
		list.add(new DashboardHomeEntity("Consulta de Operador","assets/img/operador.jpg",1));
		return list;
	}
	
	public List<ListaSaldoEntity> getSaldoCliente() throws Exception {
		List<ListaSaldoEntity> list = new ArrayList<ListaSaldoEntity>();
		list.add(new ListaSaldoEntity(1,2345,"Erick Ortega", "Soldadores SA de CV",20000, 7600, 1500));
		list.add(new ListaSaldoEntity(2,2345,"Jesus Perez", "Ganaderos Industriales",500000, 26000, 15000));
		list.add(new ListaSaldoEntity(3,2345,"Juan Valdez", "Remo soluciones",26000, 15600, 7600));
		list.add(new ListaSaldoEntity(4,2345,"Daniel Garcia", "Imagen coporrativa",20000, 26000, 1000));
		list.add(new ListaSaldoEntity(5,2345,"Erika Mendez", "La Pape Sa de CV",20000, 10000, 1500));
		list.add(new ListaSaldoEntity(6,2345,"Juan valadez", "Multimedios ",26000, 7600, 1500));
		
		return list;
	}

}
