package teste;

import java.util.List;

import daoImp.RegistroDaoImpl;
import model.Registro;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registro registro = new Registro();
		RegistroDaoImpl registrodao = new RegistroDaoImpl();
		  List<Registro> list;
		
		/*registro.setInformacao("joao");
		registro.setStatus(true);
		
    	registrodao.save(registro);
    	*/
    	
    	list = registrodao.listAll();
    	
    	for(Registro r: list){
    		System.out.println(r.toString());
    	}
		
    	registro = list.get(3);
    	registro.setInformacao("maria cagona");
    	registro.setStatus(false);
    	registrodao.save(registro);
    	
    	list = registrodao.listAll();
    	
    	for(Registro r: list){
    		System.out.println(r.toString());
    	}
    	
    	
		
	}

}
