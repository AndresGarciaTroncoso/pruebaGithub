/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author andre
 */
public class documentoDAO {
    
    public boolean add(entity.Documento a) throws Exception 
        {
            Session sessionA = HibernateUtil.getSessionFactory().openSession();
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

        public List<entity.Documento> getList() throws Exception {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            try {
                List<entity.Documento> lista = (List<entity.Documento>) session.createCriteria(entity.Documento.class).list();
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

        public boolean delete(entity.Documento a) throws Exception {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            try {
                session.delete(a);
                session.getTransaction().commit();
                session.close();
                return true;
            } catch (Exception e) {
                session.getTransaction().rollback();
                session.close();
                System.err.println(e.getMessage());
                throw e;
            }
        }

        public boolean update(entity.Documento a) throws Exception {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            try {
                session.update(a);
                session.getTransaction().commit();
                session.close();
                return true;
            } catch (Exception e) {
                session.getTransaction().rollback();
                session.close();
                System.err.println(e.getMessage());
                throw e;
            }
        }

        public entity.Documento getDocumentoById(int id) throws Exception {
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                session.beginTransaction();
                entity.Documento tmp = (entity.Documento) session.createCriteria(entity.Documento.class).add(Restrictions.eq("idDocumento", id)).uniqueResult();
                session.getTransaction().commit();
                session.close();
                return tmp;
            } catch (Exception e) {
                System.err.print(e.getMessage());
                session.close();
                throw e;
            }
        }

        public entity.Documento getDocumentoByNombre(String nombre) throws Exception {
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                session.beginTransaction();
                entity.Documento tmp = (entity.Documento) session.createCriteria(entity.Documento.class).add(Restrictions.eq("titulo", nombre)).uniqueResult();
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
