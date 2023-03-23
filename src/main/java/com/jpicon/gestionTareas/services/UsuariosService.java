package com.jpicon.gestionTareas.services;

import java.util.List;

import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;

public interface UsuariosService {
	
	public List<Usuario> findAll() throws ErrorException;
	
	public Usuario findById(Long id) throws ErrorException;
	
	public Usuario save(Usuario u) throws ErrorException;
	
	public Usuario update(Usuario u) throws ErrorException;
	
	public String delete(Long id) throws ErrorException;	

}
