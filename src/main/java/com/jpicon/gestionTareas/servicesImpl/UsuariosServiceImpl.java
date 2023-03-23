package com.jpicon.gestionTareas.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.model.Errores;
import com.jpicon.gestionTareas.repositories.UsuariosRepository;
import com.jpicon.gestionTareas.services.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository repo;
	
	@Override
	public List<Usuario> findAll() throws ErrorException {
		List<Usuario> usuarios = repo.findAll();
		if (usuarios.isEmpty()) {
			throw new ErrorException(Errores.VACIO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return usuarios;
	}

	@Override
	public Usuario findById(Long id) throws ErrorException {
		return repo.findById(id).orElseThrow(() -> new ErrorException(Errores.NO_ENCONTRADO, HttpStatus.NOT_FOUND));
	}

	@Override
	public Usuario findByToken(String token) throws ErrorException {
		return repo.findByToken(token).orElseThrow(() -> new ErrorException(Errores.NO_ENCONTRADO, HttpStatus.NOT_FOUND));
	}

	@Override
	public Usuario save(Usuario u) throws ErrorException {
		return repo.save(u);
	}

	@Override
	public Usuario update(Usuario u) throws ErrorException {
		return repo.save(u);
	}

	@Override
	public String delete(Long id) throws ErrorException {
		repo.deleteById(id);
		return "ok";
	}

}
