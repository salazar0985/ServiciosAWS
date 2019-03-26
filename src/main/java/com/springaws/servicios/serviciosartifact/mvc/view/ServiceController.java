package com.springaws.servicios.serviciosartifact.mvc.view;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatFormaPagoEntity;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoDatoEntity;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoDivisa;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by IDEX1010 on 11/02/2019.
 */

@Controller
//@RequestMapping("/services")
@Scope("session")
public class ServiceController {

//    public static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    private List<CatFormaPagoEntity> formaPagoList;
    private CatFormaPagoEntity selectedPayForm;
    private List<CatTipoDatoEntity> tipoDatoList;
    private CatTipoDatoEntity selectedTipoDato;
    private List<CatTipoDivisa> tipoDivisaList;
    private CatTipoDivisa selectedTipoDivisa;

    private CatFormaPagoRepository formaPagoRepository;
    private CatTipoDatoRepository tipoDatoRepository;
    private CatTipoDivisaRepository tipoDivisaRepository;
    private CampoServicioRepository campoServicioRepository;
    private PagoServicioRepository pagoServicioRepository;


    @Autowired
    public ServiceController(CatFormaPagoRepository formaPagoRepository, CatTipoDatoRepository tipoDatoRepository,
                             CampoServicioRepository campoServicioRepository, PagoServicioRepository pagoServicioRepository,
                             CatTipoDivisaRepository tipoDivisaRepository) {
        this.formaPagoRepository = formaPagoRepository;
        this.tipoDatoRepository = tipoDatoRepository;
        this.campoServicioRepository = campoServicioRepository;
        this.pagoServicioRepository = pagoServicioRepository;
        this.tipoDivisaRepository = tipoDivisaRepository;
    }

    @PostConstruct
    public void initBean(){

        formaPagoList = (List<CatFormaPagoEntity>) formaPagoRepository.findAll();
        tipoDatoList = (List<CatTipoDatoEntity>) tipoDatoRepository.findAll();
        tipoDivisaList = (List<CatTipoDivisa>) tipoDivisaRepository.findAll();
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String getAddServices(){
//
//         LOGGER.info("Se accedió al método GET ");
//
//        return "/servicios/service-register";
//
//    }


    public List<CatFormaPagoEntity> getFormaPagoList() {
        return formaPagoList;
    }

    public void setFormaPagoList(List<CatFormaPagoEntity> formaPagoList) {
        this.formaPagoList = formaPagoList;
    }

    public CatFormaPagoEntity getSelectedPayForm() {
        return selectedPayForm;
    }

    public void setSelectedPayForm(CatFormaPagoEntity selectedPayForm) {
        this.selectedPayForm = selectedPayForm;
    }

    public List<CatTipoDatoEntity> getTipoDatoList() {
        return tipoDatoList;
    }

    public void setTipoDatoList(List<CatTipoDatoEntity> tipoDatoList) {
        this.tipoDatoList = tipoDatoList;
    }

    public CatTipoDatoEntity getSelectedTipoDato() {
        return selectedTipoDato;
    }

    public void setSelectedTipoDato(CatTipoDatoEntity selectedTipoDato) {
        this.selectedTipoDato = selectedTipoDato;
    }

    public List<CatTipoDivisa> getTipoDivisaList() {
        return tipoDivisaList;
    }

    public void setTipoDivisaList(List<CatTipoDivisa> tipoDivisaList) {
        this.tipoDivisaList = tipoDivisaList;
    }

    public CatTipoDivisa getSelectedTipoDivisa() {
        return selectedTipoDivisa;
    }

    public void setSelectedTipoDivisa(CatTipoDivisa selectedTipoDivisa) {
        this.selectedTipoDivisa = selectedTipoDivisa;
    }
}
