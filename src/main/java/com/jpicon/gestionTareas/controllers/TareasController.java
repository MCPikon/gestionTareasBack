package com.jpicon.gestionTareas.controllers;

import java.util.List;

import com.jpicon.gestionTareas.model.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jpicon.gestionTareas.entities.Tarea;
import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.model.ResponseBase;
import com.jpicon.gestionTareas.services.TareasService;

@RestController
@RequestMapping("/tareas")
@CrossOrigin(origins = "*")
public class TareasController {
	
	@Autowired
	private TareasService tasksService;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> findAll() {
		try {
			List<Tarea> tareas = tasksService.findAll();
			return ResponseEntity.ok(tareas);
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}

	@GetMapping("/getAllByUsuarioId/{usuarioId}")
	public ResponseEntity<?> findAllByUsuario(@PathVariable("usuarioId") int usuarioId) {
		try {
			List<Tarea> tareas = tasksService.findAllByUsuarioId(usuarioId);
			return ResponseEntity.ok(tareas);
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id) {
		try {
			return ResponseEntity.ok(tasksService.findById(id));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@PostMapping("/addTarea")
	public ResponseEntity<?> save(@RequestBody Tarea t) {
		try {
			System.out.println(t.toString());
			return ResponseEntity.ok(tasksService.save(t));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@PutMapping("/updateTarea")
	public ResponseEntity<?> update(@RequestBody Tarea t) {
		try {
			return ResponseEntity.ok(tasksService.update(t));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@DeleteMapping("/deleteTarea/{idTarea}")
	public ResponseEntity<?> delete(@PathVariable("idTarea") int idTarea) {
		if (!tasksService.existsById(idTarea)) {
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
		}
		tasksService.delete(idTarea);
		return new ResponseEntity(new Mensaje("tarea eliminada"), HttpStatus.OK);
	}

}
