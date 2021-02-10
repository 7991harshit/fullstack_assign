package com.resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbResource {
	public static EntityManager getEntityManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaItemOperation");    
		EntityManager manager = emf.createEntityManager();					 
		return manager;		
	}
}
