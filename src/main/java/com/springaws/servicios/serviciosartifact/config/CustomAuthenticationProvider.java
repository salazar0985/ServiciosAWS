package com.springaws.servicios.serviciosartifact.config;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Usuario;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.UsuarioRepository;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    
    @Autowired
    private UsuarioRepository usuarioDao;
 
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
  
        String name = authentication.getName().trim();
        String password = authentication.getCredentials().toString().trim();
        
        Usuario usuario = usuarioDao.findOneByUsuarioAndContrasenia(name, password);
        
        if (usuario != null) {
  
            // use the credentials
            // and authenticate against the third-party system
            ArrayList datos = new ArrayList();
//            datos.add(usuario);
//            datos.add(usuario.getMaestroList().get(0));
            return new UsernamePasswordAuthenticationToken(name, password, datos);
        } else {
            return null;
        }
    }
 
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}

