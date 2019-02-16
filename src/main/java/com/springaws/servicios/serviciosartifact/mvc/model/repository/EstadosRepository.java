package com.springaws.servicios.serviciosartifact.mvc.model.repository;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Estados;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface EstadosRepository extends CrudRepository<Estados, Long>{
    
    @Query("select DISTINCT e.dcEstado from Estados e")
    public List<String> findDistinctDcEstado();
    
    @Query(value = "SELECT DISTINCT DcLocalidad_INEGI from Estados where DcEstado = ?1", nativeQuery = true)
    public List<String> findDistinctDcLocalidadINEGI(String estado);
    
}
