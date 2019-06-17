package util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ConectaHibernateMySQL {

	public static void main(String[] args) {
		Session sessao = null;
		sessao = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Conectou!");
		sessao.close();
	}
}
