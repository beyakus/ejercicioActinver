package com.actinver.cliente.service;

import java.util.List;

import com.actinver.cliente.dto.RequestLoginDto;
import com.actinver.cliente.dto.ResponseGenericDto;
import com.actinver.cliente.dto.ResponseListaDashboardDto;
import com.actinver.cliente.dto.ResponseTablaDto;
import com.actinver.cliente.dto.ResponseUserDto;

public interface ClienteService {

	public ResponseGenericDto getLogin(RequestLoginDto login)throws Exception;
	public List<ResponseListaDashboardDto> getListaDashboard() throws Exception;
	public List<ResponseTablaDto> getSaldoTabla() throws Exception;
}
