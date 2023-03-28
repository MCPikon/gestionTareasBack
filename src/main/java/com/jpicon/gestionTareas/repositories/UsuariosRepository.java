package com.jpicon.gestionTareas.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpicon.gestionTareas.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	Optional<Usuario> findByEmail(String email);
	boolean existsByEmail(String email);
}
