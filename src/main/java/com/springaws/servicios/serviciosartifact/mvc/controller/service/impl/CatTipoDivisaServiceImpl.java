package com.springaws.servicios.serviciosartifact.mvc.controller.service.impl;

import com.springaws.servicios.serviciosartifact.mvc.controller.service.CatTipoDivisaService;
import com.springaws.servicios.serviciosartifact.mvc.model.dto.CurrencyTypeDto;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoDivisa;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.CatTipoDivisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatTipoDivisaServiceImpl implements CatTipoDivisaService {


    private CatTipoDivisaRepository tipoDivisaRepository;

    @Autowired
    public CatTipoDivisaServiceImpl(CatTipoDivisaRepository tipoDivisaRepository) {
        this.tipoDivisaRepository = tipoDivisaRepository;
    }

    @Override
    public CurrencyTypeDto findCurrencyByKey(String key) {

        CurrencyTypeDto result = new CurrencyTypeDto();

        CatTipoDivisa entity = tipoDivisaRepository.findByClave(key);

        if(entity != null){
            result.setCurrencyId(entity.getIdDivisa());
            result.setKey(entity.getClave());
            result.setDescription(entity.getDescripcion());
            return result;
        }

        return null;
    }
}
