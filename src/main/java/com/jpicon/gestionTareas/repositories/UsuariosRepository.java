package com.jpicon.gestionTareas.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpicon.gestionTareas.entities.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByToken(String token);
	Optional<Usuario> findOneByEmail(String email);
}
