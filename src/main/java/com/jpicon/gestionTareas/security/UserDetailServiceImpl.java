package com.jpicon.gestionTareas.security;

import com.jpicon.gestionTareas.entities.Usuario;
import com.jpicon.gestionTareas.model.ErrorException;
import com.jpicon.gestionTareas.model.Errores;
import com.jpicon.gestionTareas.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public UserDetails loadUserByUsername(String email) throws ErrorException {
        Usuario usuario = usuariosRepository.findOneByEmail(email)
                .orElseThrow(() -> new ErrorException(Errores.USUARIO_NO_EXISTE, HttpStatus.NOT_FOUND));

        return new UserDetailsImpl(usuario);
    }

}
