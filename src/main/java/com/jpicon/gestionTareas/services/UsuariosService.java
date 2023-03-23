package com.jpicon.gestionTareas.services;

import java.util.List;
import java.util.Optional;

import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;

public interface UsuariosService {
	
	public List<Usuario> findAll() throws ErrorException;
	
	public Usuario findById(int id) throws ErrorException;

	public Optional<Usuario> getByEmail(String email) throws ErrorException;

	public Optional<Usuario> getByTokenPassword(String tokenPassword) throws ErrorException;

	public boolean existsByEmail(String email) throws ErrorException;
	
	public Usuario save(Usuario u) throws ErrorException;
	
	public Usuario update(Usuario u) throws ErrorException;
	
	public String delete(int id) throws ErrorException;

}
