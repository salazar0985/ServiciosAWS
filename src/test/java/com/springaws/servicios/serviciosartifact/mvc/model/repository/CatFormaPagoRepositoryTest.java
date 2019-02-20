package com.springaws.servicios.serviciosartifact.mvc.model.repository;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatFormaPagoEntity;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by IDEX1010 on 19/02/2019.
 */
public class CatFormaPagoRepositoryTest extends TestCase {

    @Autowired
    private CatFormaPagoRepository catFormaPagoRepository;

    @Test
    public void findAllTest(){

        List<CatFormaPagoEntity> result = (List<CatFormaPagoEntity>) catFormaPagoRepository.findAll();

        result.toString();
    }

}