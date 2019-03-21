package com.springaws.servicios.serviciosartifact.mvc.model.repository;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Estados;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface EstadosRepository extends CrudRepository<Estados, Long>{
    
    @Query("select DISTINCT e.dcEstado from Estados e")
    public List<String> findDistinctEstado();
    
    @Query(value = "SELECT DISTINCT DcLocalidad_INEGI from Estados where DcEstado = ?1", nativeQuery = true)
    public List<String> findDistinctMunicipio(String estado);
    
    @Query(value = "SELECT DISTINCT DcMunicipio from Estados where DcLocalidad_INEGI = ?1", nativeQuery = true)
    public List<String> findDistinctColonia(String municipio);
    
    @Query(value = "SELECT DISTINCT Cp FROM Estados WHERE DcLocalidad_INEGI = ?1 and DcMunicipio = ?2", nativeQuery = true)
    public List<String> findDistinctCodigoPostal(String municipio, String colonia);
    
    public List<Estados> findEstadosByCp(String cp);
    
}
