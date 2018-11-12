package com.actinver.cliente.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.actinver.cliente.dto.RequestLoginDto;
import com.actinver.cliente.dto.ResponseGenericDto;
import com.actinver.cliente.dto.ResponseListaDashboardDto;
import com.actinver.cliente.dto.ResponseTablaDto;
import com.actinver.cliente.dto.ResponseUserDto;
import com.actinver.cliente.entity.DashboardHomeEntity;
import com.actinver.cliente.entity.ListaSaldoEntity;
import com.actinver.cliente.entity.UserLoginEntity;
import com.actinver.cliente.repository.DahsboardRepository;
import com.actinver.cliente.repository.UserLoginRepository;
import com.actinver.cliente.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private UserLoginRepository userLoginRepository;
	@Autowired
	private DahsboardRepository dahsboardRepository;
	
	@Override
	@Transactional
	public ResponseGenericDto getLogin(RequestLoginDto login) throws Exception {
		ResponseGenericDto result = new ResponseGenericDto();
		if(!login.getUser().isEmpty() && !login.getPassword().isEmpty()) {
			List<UserLoginEntity> list = userLoginRepository.findUser(login.getUser(), login.getPassword());
			if(list.size() > 0) {
				List<ResponseUserDto> listResult = new ArrayList<ResponseUserDto>();
				for(UserLoginEntity l: list) {
					listResult.add(new ResponseUserDto(l.getNombre(),l.getApellidoPaterno(),l.getApellidoMaterno(),l.getUser(),l.getRol()));	
				}
				result.setMessages("success.");
				result.setData(listResult);
			}
			else {
				result.setStatus(false);
				result.setMessages("El usuario o password invalidos");
			}
		}else{
			result.setStatus(false);
			result.setMessages("El usuario o password estan vacios");
		}
				
		return result;
	}

	@Override
	@Transactional
	public List<ResponseListaDashboardDto> getListaDashboard() throws Exception {
		List<ResponseListaDashboardDto> result = new ArrayList<ResponseListaDashboardDto>();
		for(DashboardHomeEntity l: dahsboardRepository.getobtieneSecciones()) {
			result.add(new ResponseListaDashboardDto(l.getNombreSeccion(),l.getImagenUrl()));
		}
		return result;
	}

	@Override
	@Transactional
	public List<ResponseTablaDto> getSaldoTabla() throws Exception {
		List<ResponseTablaDto> result = new ArrayList<ResponseTablaDto>();
		for(ListaSaldoEntity l : dahsboardRepository.getSaldoCliente()) {
			result.add(new ResponseTablaDto(l.getId(),l.getNombre(),"Pendiente",l.getSaldoActual(), l.getPendientePorPagar()));
		}
		return result;
	}
	
	
}
