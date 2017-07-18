/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author andre
 */
public class ejemplarDAO {
    public boolean add(entity.Ejemplar a) throws Exception 
        {
            Session sessionA = dal.HibernateUtil.getSessionFactory().openSession();
            sessionA.beginTransaction();
            try {
                sessionA.save(a);
                sessionA.getTransaction().commit();
                sessionA.close();
                return true;
            } catch (Exception e) {
                sessionA.getTransaction().rollback();
                sessionA.close();
                System.err.println(e.getMessage());
                throw e;
            }
        }        
        
        public List<entity.Ejemplar> getList() throws Exception {
            Session session = dal.HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            try {
                List<entity.Ejemplar> lista = (List<entity.Ejemplar>) session.createCriteria(entity.Ejemplar.class).list();
                session.getTransaction().commit();
                return lista;
            } catch (Exception e) {
                session.getTransaction().rollback();
                session.close();
                System.err.println(e.getMessage());
                throw e;
            } finally {
                session.close();
            }
        }
    
    public entity.Ejemplar getEjemplarById(int id) throws Exception {
            Session session = dal.HibernateUtil.getSessionFactory().openSession();
            try {
                session.beginTransaction();
                entity.Ejemplar tmp = (entity.Ejemplar) session.createCriteria(entity.Ejemplar.class).add(Restrictions.eq("id", id)).uniqueResult();
                session.getTransaction().commit();
                session.close();
                return tmp;
            } catch (Exception e) {
                System.err.print(e.getMessage());
                session.close();
                throw e;
            }
        }
}
