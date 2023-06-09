package com.jpicon.gestionTareas.services;

import java.util.Date;
import java.util.List;

import com.jpicon.gestionTareas.entities.Tarea;
import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;

public interface TareasService {
	
	public List<Tarea> findAll() throws ErrorException;

	public List<Tarea> findAllByUsuarioId(int usuarioId) throws ErrorException;

	public List<Tarea> findByFechaLimiteBetweenAndUsuario_Id(Date fechaLimiteStart, Date fechaLimiteEnd, int id) throws ErrorException;

	public List<Tarea> findAllByEstadoAndUsuarioId(String estado, int usuarioId) throws ErrorException;

	public boolean existsById(int id) throws ErrorException;
	
	public Tarea findById(int id) throws ErrorException;
	
	public Tarea save(Tarea t) throws ErrorException;
	
	public Tarea update(Tarea t) throws ErrorException;
	
	public String delete(int id) throws ErrorException;
	
}
