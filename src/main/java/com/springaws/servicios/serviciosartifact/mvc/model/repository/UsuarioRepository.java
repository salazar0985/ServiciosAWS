package com.springaws.servicios.serviciosartifact.mvc.model.repository;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
    public Usuario findOneByUsuarioAndContrasenia(String usuario, String contrasenia);
    
}
