package com.springaws.servicios.serviciosartifact.mvc.model.repository;

import com.springaws.servicios.serviciosartifact.mvc.controller.service.CatTipoDivisaService;
import com.springaws.servicios.serviciosartifact.mvc.model.dto.CurrencyTypeDto;
import com.springaws.servicios.serviciosartifact.mvc.model.dto.ServiceDataDto;
import com.springaws.servicios.serviciosartifact.mvc.model.dto.ServicePaymentDto;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoDivisa;
import org.springframework.data.repository.CrudRepository;

public interface CatTipoDivisaRepository extends CrudRepository<CatTipoDivisa,Long> {

            CatTipoDivisa findByClave(String key);

}
