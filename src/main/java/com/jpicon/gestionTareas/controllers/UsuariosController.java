package com.jpicon.gestionTareas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.model.ResponseBase;
import com.jpicon.gestionTareas.services.UsuariosService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuariosController {

	@Autowired
	private UsuariosService usersService;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> findAll() {
		try {
			List<Usuario> usuarios = usersService.findAll();
			return ResponseEntity.ok(usuarios);
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id) {
		try {
			return ResponseEntity.ok(usersService.findById(id));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}

	@GetMapping("/getByEmail/{email}")
	public ResponseEntity<?> getByEmail(@PathVariable("email") String email) {
		try {
			return ResponseEntity.ok(usersService.getByEmail(email));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@PostMapping("/addUsuario")
	public ResponseEntity<?> save(@RequestBody Usuario u) {
		try {
			return ResponseEntity.ok(usersService.save(u));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@PutMapping("/updateUsuario")
	public ResponseEntity<?> update(@RequestBody Usuario u) {
		try {
			return ResponseEntity.ok(usersService.update(u));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
	@DeleteMapping("/deleteUsuario/{idUsuario}")
	public ResponseEntity<?> delete(@PathVariable("idUsuario") int idUsuario) {
		try {
			return ResponseEntity.ok(usersService.delete(idUsuario));
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
}
