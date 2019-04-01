package com.springaws.servicios.serviciosartifact.mvc.view;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.DatosUsuario;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Domicilio;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Estados;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Usuario;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.EstadosRepository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
@ViewScoped
public class UsuarioController {
    
    @Autowired
    private EstadosRepository estadosRepository;
    
    private Usuario usuario;
    private DatosUsuario datosUsuario;
    private Domicilio domicilio;
    
    private List<String> estadoList;
    private List<String> municipioList;
    private List<String> coloniaList;
    private List<String> codigoPostalList;
    
    private Boolean pantallaRegistroUsuarios;
    private Boolean pantallaDatosBancarios;
  
    @PostConstruct
    private void postCostruct(){
        usuario = new Usuario();
        datosUsuario = new DatosUsuario();
        domicilio = new Domicilio();
        estadoList =  estadosRepository.findDistinctEstado();
        pantallaRegistroUsuarios = true;
        pantallaDatosBancarios = false;
    }
    
    public void actualizarMunicipio(){
        municipioList =  estadosRepository.findDistinctMunicipio(domicilio.getEstado());
    }
    
    public void actulizarColonia(){
        coloniaList =  estadosRepository.findDistinctColonia(domicilio.getMunicipio());
    }
    
    public void actualizarCodigoPostal(){
        codigoPostalList = estadosRepository.findDistinctCodigoPostal(domicilio.getMunicipio(), domicilio.getColonia());
    }
    
    public void establecerDireccionPorCodigoPostal(){
        List<Estados> estadoList = estadosRepository.findEstadosByCp(domicilio.getCodigoPostal().toString());
        domicilio.setEstado(estadoList.get(0).getDcEstado());
        municipioList =  estadosRepository.findDistinctMunicipio(domicilio.getEstado());
        domicilio.setMunicipio(estadoList.get(0).getDcLocalidadINEGI());
        coloniaList = new ArrayList<>();
        for(Estados estado : estadoList){
            coloniaList.add(estado.getDcMunicipio());
        }
        domicilio.setColonia(estadoList.get(0).getDcMunicipio());
    }
    
    public void verPantallaDatosUsuario(){
        pantallaRegistroUsuarios = true;
        pantallaDatosBancarios = false;
    }
    
    public void verPantallaDatosBancarios(){
        pantallaRegistroUsuarios = false;
        pantallaDatosBancarios = true;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<String> getEstadoList() {
        return estadoList;
    }

    public void setEstadoList(List<String> estadoList) {
        this.estadoList = estadoList;
    }

    public List<String> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<String> municipioList) {
        this.municipioList = municipioList;
    }

    public List<String> getColoniaList() {
        return coloniaList;
    }

    public void setColoniaList(List<String> coloniaList) {
        this.coloniaList = coloniaList;
    }

    public List<String> getCodigoPostalList() {
        return codigoPostalList;
    }

    public void setCodigoPostalList(List<String> codigoPostalList) {
        this.codigoPostalList = codigoPostalList;
    }

    public Boolean getPantallaRegistroUsuarios() {
        return pantallaRegistroUsuarios;
    }

    public void setPantallaRegistroUsuarios(Boolean pantallaRegistroUsuarios) {
        this.pantallaRegistroUsuarios = pantallaRegistroUsuarios;
    }

    public Boolean getPantallaDatosBancarios() {
        return pantallaDatosBancarios;
    }

    public void setPantallaDatosBancarios(Boolean pantallaDatosBancarios) {
        this.pantallaDatosBancarios = pantallaDatosBancarios;
    }
    
}
