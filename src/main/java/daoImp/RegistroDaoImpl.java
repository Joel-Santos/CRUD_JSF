package daoImp;

import interfaces.IRegistroDao;
import model.Registro;

public class RegistroDaoImpl extends GenericDaoImpl<Registro, Integer> implements IRegistroDao {
	
	 public  RegistroDaoImpl() { 
	        super(Registro.class); 
	 } 

	 
	 
}