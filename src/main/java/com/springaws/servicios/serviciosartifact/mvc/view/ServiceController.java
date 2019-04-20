package com.springaws.servicios.serviciosartifact.mvc.view;

import com.springaws.servicios.serviciosartifact.mvc.model.dto.ServiceFieldDto;
import com.springaws.servicios.serviciosartifact.mvc.model.dto.ServicePaymentDto;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatFormaPagoEntity;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoDatoEntity;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoDivisa;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEX1010 on 11/02/2019.
 */

@Controller
@Scope("session")
public class ServiceController {

    public static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    private List<CatFormaPagoEntity> formaPagoList;
    private CatFormaPagoEntity selectedPayForm;
    private List<CatTipoDatoEntity> tipoDatoList;
    private CatTipoDatoEntity selectedTipoDato;
    private List<CatTipoDivisa> tipoDivisaList;
    private CatTipoDivisa selectedTipoDivisa;


    private String serviceName;
    private ServiceFieldDto fieldDto;
    private String fieldName;
    private String selectedDataType;
    private List<ServiceFieldDto> fieldList;
    private  ServicePaymentDto paymentDto;
    private List<ServicePaymentDto> paymentList;


    /**
     * Repositories
     * */
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
        fieldDto = new ServiceFieldDto();
//        fieldName = new String();
//        selectedDataType = new String();
        fieldList = new ArrayList<>();
    }

    public void addField(){
        fieldDto = new ServiceFieldDto(fieldName, selectedDataType);
        if(!fieldName.isEmpty() && !selectedDataType.isEmpty())
            fieldList.add(fieldDto);
        fieldName = new String();
        selectedDataType = new String();
        LOGGER.info("Se agregó un campo {}",fieldList.toString());
    }

    public void removeField(ServiceFieldDto fieldDto){

        fieldList.remove(fieldDto);
    }

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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<ServiceFieldDto> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<ServiceFieldDto> fieldList) {
        this.fieldList = fieldList;
    }

    public List<ServicePaymentDto> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<ServicePaymentDto> paymentList) {
        this.paymentList = paymentList;
    }

    public ServiceFieldDto getFieldDto() {
        return fieldDto;
    }

    public void setFieldDto(ServiceFieldDto fieldDto) {
        this.fieldDto = fieldDto;
    }

    public ServicePaymentDto getPaymentDto() {
        return paymentDto;
    }

    public void setPaymentDto(ServicePaymentDto paymentDto) {
        this.paymentDto = paymentDto;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getSelectedDataType() {
        return selectedDataType;
    }

    public void setSelectedDataType(String selectedDataType) {
        this.selectedDataType = selectedDataType;
    }
}
