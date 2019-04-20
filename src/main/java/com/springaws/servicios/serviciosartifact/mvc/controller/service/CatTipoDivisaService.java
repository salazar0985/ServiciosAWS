package com.springaws.servicios.serviciosartifact.mvc.controller.service;

import com.springaws.servicios.serviciosartifact.mvc.model.dto.CurrencyTypeDto;

public interface CatTipoDivisaService {

    CurrencyTypeDto findCurrencyByKey(String key);
}
