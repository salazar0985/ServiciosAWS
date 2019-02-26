package com.springaws.servicios.serviciosartifact.mvc.view;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.DatosUsuario;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Domicilio;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Usuario;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.EstadosRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller
@Scope("session")
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
  
    @PostConstruct
    private void postCostruct(){
        usuario = new Usuario();
        datosUsuario = new DatosUsuario();
        domicilio = new Domicilio();
        estadoList =  estadosRepository.findDistinctEstado();
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
    
    public void agregarusuario(){
        
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
    
}
