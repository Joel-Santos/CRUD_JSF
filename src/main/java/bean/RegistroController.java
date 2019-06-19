package bean;

import java.io.Serializable;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import daoImp.RegistroDaoImpl;
import model.Registro;

@ManagedBean(name="c")
public class RegistroController implements Serializable{

	private static final long serialVersionUID = -2596942688238440151L;
	
	private Registro registro;
	private List<Registro> listaRegistros;
	
	
	
	public RegistroController() {
		this.registro = new Registro();
		RegistroDaoImpl registrodao = new RegistroDaoImpl();
	}
	
	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	

	public List<Registro> getListaRegistros() {
		RegistroDaoImpl registrodao = new RegistroDaoImpl();
        this.listaRegistros = registrodao.listAll();
		return listaRegistros;
	}
	public void setListaRegistros(List<Registro> listaRegistros) {
		this.listaRegistros = listaRegistros;
	}
    

	public void salvar(){
		RegistroDaoImpl registrodao = new RegistroDaoImpl();
    	registrodao.save(this.registro);
    	this.registro = new Registro();
    	Messages.addGlobalInfo("Cadastro realizado com sucesso");//Mensagem de confirmação;
    }
	
	public void editar(Registro registro){

	    	this.registro = registro;

	 }
	 
	 public void remover(Registro registro){
		 RegistroDaoImpl registrodao = new RegistroDaoImpl();
	        registro.setStatus(false);
	        registrodao.save(registro);    
	 }
	
	public static long getSerialversionuid() {
			return serialVersionUID;
	}
	

}
