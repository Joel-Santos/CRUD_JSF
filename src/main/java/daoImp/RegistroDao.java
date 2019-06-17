package daoImp;

import java.util.List;

import model.Registro;

public interface RegistroDao {
	
	public void save(Registro registro);
    public Registro getRegistro(Integer id);
    public List<Registro> list();
    public void remove(Registro registro);
    public void update(Registro registro);

}
