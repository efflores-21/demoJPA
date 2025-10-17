package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Sucursal;

import java.util.List;

public class DAOSucursal implements IDAOSucursal {

    @Override
    public List<Sucursal> getAll() {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try {
            //em.CreateQuery("SELECT u FROM Sucursal u", Sucursal.class");
            TypedQuery<Sucursal> query = em.createNamedQuery("Sucursal.findAll", Sucursal.class);
            return query.getResultList();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            em.close();
        }
        return null;
    }

    @Override
    public void insert(Sucursal sucursal) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(sucursal);
            em.flush();
            em.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            em.close();
        }
    }

    @Override
    public void update(Sucursal sucursal) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(sucursal);
            em.flush();
            em.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            em.close();
        }
    }

    @Override
    public void delete(Sucursal sucursal) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try{
            em.getTransaction().begin();
            em.remove(em.merge(sucursal));
            em.flush();
            em.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }

    @Override
    public Sucursal getById(Integer id) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try {
            Sucursal sucursal = em.find(Sucursal.class, id);
            return sucursal;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return null;
    }
}
