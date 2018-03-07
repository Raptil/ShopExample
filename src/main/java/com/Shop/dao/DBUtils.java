package com.Shop.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtils {

    private static EntityManagerFactory emf;

    static{
        try{
            emf= Persistence.createEntityManagerFactory("persistenceUnit");
        }catch(Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    public static void close(){
        emf.close();
    }
}
