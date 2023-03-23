package com.jpicon.gestionTareas.security.servicesImpl;

import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.repositories.UsuariosRepository;
import com.jpicon.gestionTareas.security.entities.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuariosRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repo.findByEmail(email).get();
        return UsuarioPrincipal.build(usuario);
    }
}
