package com.jpicon.gestionTareas.security.repositories;

import com.jpicon.gestionTareas.security.entities.Rol;
import com.jpicon.gestionTareas.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
