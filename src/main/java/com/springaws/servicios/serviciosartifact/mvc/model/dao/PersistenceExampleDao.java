package com.springaws.servicios.serviciosartifact.mvc.model.dao;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.PersistenceExample;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by IDEX1010 on 30/01/2019.
 */
public interface PersistenceExampleDao extends CrudRepository<PersistenceExample ,Integer>{
    List<PersistenceExample> findByRfc(String rfc);
}
