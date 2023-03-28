package com.jpicon.gestionTareas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Errores {

	NO_ENCONTRADO(1L,"No encontrado"),
	DESCONOCIDO(2L,"Desconocido"),
	VACIO(3L,"Lista vacia"),
	USUARIO_NO_EXISTE(4L, "El usuario no existe"),
	USUARIO_YA_CREADO(5L, "Un usuario con este email ya ha sido creado"),
	CAMPOS_MAL_PUESTOS(6L,"Campos mal puestos o email inválido");

	
	private Long id;
	private String mensaje;
	
}
