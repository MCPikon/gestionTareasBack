package com.jpicon.gestionTareas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class ErrorException extends RuntimeException {

	private static final long serialVersionUID = 7358330923614115585L;
	
	private Long id;
	private String mensaje;
	private HttpStatus idStatus;

	public ErrorException(Errores error, HttpStatus idStatus) {
		super();
		this.id = error.getId();
		this.mensaje = error.getMensaje();
		this.idStatus = idStatus;
	}
	
}
