package com.jpicon.gestionTareas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseBase {
	
	private Long id;
	private String mensaje;

	public ResponseBase(ErrorException e) {
		super();
		this.id = e.getId();
		this.mensaje = e.getMensaje();
	}
	
}
