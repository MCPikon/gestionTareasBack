package com.jpicon.gestionTareas.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jpicon.gestionTareas.entities.Tarea;
import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.model.Errores;
import com.jpicon.gestionTareas.repositories.TareasRepository;
import com.jpicon.gestionTareas.services.TareasService;

@Service
public class TareasServiceImpl implements TareasService {

	@Autowired
	private TareasRepository repo;
	
	@Override
	public List<Tarea> findAll() throws ErrorException {
		List<Tarea> tareas = repo.findAll();
		if (tareas.isEmpty()) {
			throw new ErrorException(Errores.VACIO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return tareas;
	}
	
	@Override
	public List<Tarea> findAllByUsuario(Usuario u) throws ErrorException {
		return repo.findByUsuario(u);
	}

	@Override
	public Tarea findById(Long id) throws ErrorException {
		return repo.findById(id).orElseThrow(() -> new ErrorException(Errores.NO_ENCONTRADO, HttpStatus.NOT_FOUND));
	}

	@Override
	public Tarea save(Tarea t) throws ErrorException {
		return repo.save(t);
	}

	@Override
	public Tarea update(Tarea t) throws ErrorException {
		return repo.save(t);
	}

	@Override
	public String delete(Long id) throws ErrorException {
		repo.deleteById(id);
		return "ok";
	}


}
