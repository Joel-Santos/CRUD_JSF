package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.*;
import daoImp.*;

@ManagedBean
@SessionScoped
public class RegistroController {

	private Registro registro;
	private List<Registro> listaRegistros;
	
	
	
	
	public RegistroController() {
		super();
		this.registro = new Registro();
		RegistroDao registrodao = new RegistroDaoImplements();
		this.setListaRegistros(registrodao.list());
	}
	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
	public List<Registro> getListaRegistros() {
		RegistroDao registrodao = new RegistroDaoImplements();
        this.listaRegistros = registrodao.list();
		return listaRegistros;
	}
	public void setListaRegistros(List<Registro> listaRegistros) {
		this.listaRegistros = listaRegistros;
	}
    

	public void salvar(){
    	RegistroDao registrodao = new RegistroDaoImplements();
    	
    	registrodao.update(this.registro);
    	
    	this.registro = new Registro();
    }
	
	public void editar(Registro registro){

	    	this.registro = registro;

	 }
	 
	 public void remover(Registro registro){
	        RegistroDao registrodao = new RegistroDaoImplements();
	        registro.setStatus(false);
	        registrodao.update(registro);    
	 }
	
	
	

}
