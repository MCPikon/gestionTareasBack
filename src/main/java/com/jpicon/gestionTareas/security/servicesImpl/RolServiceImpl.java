package com.jpicon.gestionTareas.security.servicesImpl;

import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.security.entities.Rol;
import com.jpicon.gestionTareas.security.enums.RolNombre;
import com.jpicon.gestionTareas.security.repositories.RolRepository;
import com.jpicon.gestionTareas.security.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository repo;


    @Override
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) throws ErrorException {
        return repo.findByRolNombre(rolNombre);
    }

    @Override
    public Rol save(Rol rol) {
        return repo.save(rol);
    }
}
