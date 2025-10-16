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

    }

    @Override
    public void update(Sucursal sucursal) {

    }

    @Override
    public void delete(Sucursal sucursal) {

    }

    @Override
    public Sucursal getById(Integer id) {
        return null;
    }
}
