package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static String UNIDAD_PERSISTENCIA = "prueba";
    public static EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(UNIDAD_PERSISTENCIA);
        EntityManager em = emf.createEntityManager();
        return em;
    }
    private EntityManagerAdmin(){ }
}
