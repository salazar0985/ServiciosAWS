/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springaws.servicios.serviciosartifact.config;

import java.util.ArrayList;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 *
 * @author pimen
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    
//    @Autowired
//    private UsuarioDao usuarioDao;
 
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
  
        String name = authentication.getName().trim();
        String password = authentication.getCredentials().toString().trim();
        
//        Usuario usuario = usuarioDao.findOneByUsuarioAndContrasenia(name, password);
        
        if (true) {
  
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

