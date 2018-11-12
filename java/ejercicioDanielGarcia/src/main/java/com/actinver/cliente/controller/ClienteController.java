package com.actinver.cliente.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.actinver.cliente.dto.RequestLoginDto;
import com.actinver.cliente.dto.ResponseGenericDto;
import com.actinver.cliente.service.ClienteService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path="/user")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@CrossOrigin
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<?> getCliente(HttpServletRequest request) {
		ResponseGenericDto result = new ResponseGenericDto();
		try {
			RequestLoginDto requestLoginDto = new ObjectMapper().readValue(request.getInputStream(), RequestLoginDto.class);
			result = clienteService.getLogin(requestLoginDto);
		}catch(Exception e) {

		}
		return new ResponseEntity<ResponseGenericDto>(result, HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value="/seccionDashboard", method=RequestMethod.POST)
	public ResponseEntity<?> getListaSeccionDashboard(){
		ResponseGenericDto result = new ResponseGenericDto();
		
		try {
			result.setData(clienteService.getListaDashboard());
			result.setMessages("success.");
		}catch(Exception e) {
			result.setStatus(false);
			result.setMessages("Lo sentimos. Hubo un problema con el servicio " + e.toString());
		}
		
		return new ResponseEntity<ResponseGenericDto>(result, HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value="/datoTablaDashboard", method=RequestMethod.POST)
	public ResponseEntity<?> getDatoTablaDashboard(){
		ResponseGenericDto result = new ResponseGenericDto();
		
		try {
			result.setData(clienteService.getSaldoTabla());
			result.setMessages("success.");
		}catch(Exception e) {
			result.setStatus(false);
			result.setMessages("Lo sentimos, hubo un error en la consulta. " + e.toString());
		}
		return new ResponseEntity<ResponseGenericDto>(result,HttpStatus.OK);
	}
	
}
