package com.jpicon.gestionTareas.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tarea")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "titulo", nullable = false)
	private String titulo;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_limite", nullable = false)
	private Date fechaLimite;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	@JsonIgnoreProperties({"tareas"})
	private Usuario usuario;

	public Tarea(int id, Usuario usuario) {
		super();
		this.id = id;
		this.usuario = usuario;
	}

}
