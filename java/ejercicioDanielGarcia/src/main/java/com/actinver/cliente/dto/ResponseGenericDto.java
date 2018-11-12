package com.actinver.cliente.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseGenericDto {

	public boolean status = true;
	public String messages = null;
	public List<?> data = new ArrayList<>();

	public ResponseGenericDto() {}
	
	public ResponseGenericDto(String mensaje) {
		this.messages = mensaje;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}
	
	
}
