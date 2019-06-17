package daoImp;

import model.Registro;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;


public class RegistroDaoImplements implements RegistroDao {
	

	 public void save(Registro registro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(registro);
        t.commit();
    }
	 
	 
	public Registro getRegistro(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        return (Registro) session.load(Registro.class, id);
	}

	public List<Registro> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Registro> lista = (List<Registro>) session.createQuery("from tb_item where status = true",Registro.class).list();
        t.commit();
        return lista;
	}

	//PRECISA MELHORAR 
	public void remove(Registro registro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(registro);
        t.commit();
		
	}

	public void update(Registro registro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.saveOrUpdate(registro);
        t.commit();
	}

}
