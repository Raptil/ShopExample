package com.Shop.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Алексей on 23.02.2018.
 */
public abstract class CRUDDao<T> {

    private Class<T> type;

    public CRUDDao(Class<T> type){
        this.type=type;
    }

    public Class<T> getType() {
        return type;
    }

    @Autowired
    private EntityManager entityManager= DBUtils.getEntityManager();

    @Transactional
    public void create(T newInstance){

          entityManager.getTransaction().begin();
          entityManager.persist(newInstance);
          entityManager.getTransaction().commit();
          entityManager.detach(newInstance);

    }

    @Transactional(readOnly = true)
    public T read(int instanceId){
        T entity = (T) entityManager.find(type,instanceId);
        entityManager.detach(entity);
        return entity;
    }
    @Transactional
    public T update(T transientObject){
        entityManager.getTransaction().begin();
        T entity = entityManager.merge(transientObject);
        entityManager.getTransaction().commit();
        entityManager.detach(transientObject);
        return entity;
    }

    @Transactional
    public void delete(T persistenceObject){
        entityManager.getTransaction().begin();
        entityManager.remove(persistenceObject);
        entityManager.getTransaction().commit();
        entityManager.detach(persistenceObject);
    }

    @Transactional
    public void delete(int objectId){
        T entity = entityManager.find(type,objectId);
        if(entity!=null){
            delete(entity);
        }
    }
    @Transactional(readOnly = true)
    public List<T> readAll(){
        return entityManager.createQuery("SELECT * FROM "+type.getSimpleName()).getResultList();
    }

}
