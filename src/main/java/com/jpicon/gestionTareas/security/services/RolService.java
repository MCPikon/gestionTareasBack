package com.jpicon.gestionTareas.security.services;

import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.security.entities.Rol;
import com.jpicon.gestionTareas.security.enums.RolNombre;

import java.util.Optional;

public interface RolService {

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) throws ErrorException;
    public Rol save(Rol rol);

}
