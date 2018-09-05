package ch.bozaci.homepage.access;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public abstract class AbstractRepository implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Inject
    protected EntityManager em;
    
    protected <T> void persist(T entity)
    {
        //em.getTransaction().begin();
        em.persist(entity);
        //em.getTransaction().commit();
    }

}
