package com.springaws.servicios.serviciosartifact.mvc.view;

import com.springaws.servicios.serviciosartifact.mvc.model.persistence.CatTipoTarjeta;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.DatosUsuario;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Domicilio;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Estados;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Usuario;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.DatosBanc;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Rol;
import com.springaws.servicios.serviciosartifact.mvc.model.persistence.Tarjeta;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.DatosBancRepository;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.DatosUsuarioRepository;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.DomicilioRepository;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.EstadosRepository;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.TarjetaRepository;
import com.springaws.servicios.serviciosartifact.mvc.model.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
@ViewScoped
public class UsuarioController {
    
    @Autowired
    private EstadosRepository estadosRepository;
    
    @Autowired
    private DomicilioRepository domicilioRepository;
    
    @Autowired
    private DatosUsuarioRepository datosUsuarioRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private DatosBancRepository datosBancRepository;
    
    @Autowired
    private TarjetaRepository tarjetaRepository;
    
    private Usuario usuario;
    private DatosUsuario datosUsuario;
    private Domicilio domicilio;
    private DatosBanc datosBanc;
    private Tarjeta tarjeta;
    
    private List<String> estadoList;
    private List<String> municipioList;
    private List<String> coloniaList;
    private List<String> codigoPostalList;
  
    @PostConstruct
    private void postCostruct(){
        initComponents();
        estadoList =  estadosRepository.findDistinctEstado();
    }
    
    private void initComponents(){
        municipioList = new ArrayList<>();
        coloniaList = new ArrayList<>();
        codigoPostalList = new ArrayList<>();
        usuario = new Usuario();
        datosUsuario = new DatosUsuario();
        domicilio = new Domicilio();
        datosBanc = new DatosBanc();
        tarjeta = new Tarjeta();
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

    public void agregarUsuario(){
        domicilio.setActivo(Boolean.TRUE);
        domicilio = domicilioRepository.save(domicilio);
        datosUsuario.setActivo(Boolean.TRUE);
        datosUsuario.setIdDomicilio(domicilio);
        datosUsuario = datosUsuarioRepository.save(datosUsuario);
        usuario.setFechaCreacion(new Date());
        usuario.setFechaActualizacion(new Date());
        usuario.setIdDatosUsr(datosUsuario);
        usuario.setIdRol(new Rol(1));
        usuario = usuarioRepository.save(usuario);
        datosBanc.setActivo(Boolean.TRUE);
        datosBanc.setFechaCreacion(new Date());
        datosBanc.setFechaActualizacion(new Date());
        datosBanc = datosBancRepository.save(datosBanc);
        tarjeta.setIdDatosBanc(datosBanc);
        tarjeta.setIdTipoTarjeta(new CatTipoTarjeta(1));
        tarjeta.setActivo(Boolean.TRUE);
        tarjeta.setFechaExpiracion(new Date());
        tarjetaRepository.save(tarjeta);
        initComponents();
        
        FacesContext context = FacesContext.getCurrentInstance();        
        context.addMessage(null, new FacesMessage("Successful",  "Your message: Se ha creado el usuario exitosamente.") );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
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

    public DatosBanc getDatosBanc() {
        return datosBanc;
    }

    public void setDatosBanc(DatosBanc datosBanc) {
        this.datosBanc = datosBanc;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}
