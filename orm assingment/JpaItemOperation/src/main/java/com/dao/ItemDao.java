package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bean.Item;
import com.resource.DbResource;

public class ItemDao {
	
	DbResource db=new DbResource();
	public List<Item> getAllItem(){	
		EntityManager manager=db.getEntityManager();
		Query qry=manager.createQuery("select i from Item i");
		List<Item> listOfItem=qry.getResultList();
		return listOfItem;
	}
	
	public void storeItem(Item ii){
		EntityManager manager=db.getEntityManager();
		EntityTransaction tran=manager.getTransaction();
		tran.begin();
		manager.persist(ii);
		tran.commit();
		System.out.println("Item Stored Successfully");
	}
	
	public void deleteItem(int id) {
		EntityManager manager=db.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Item i	= manager.find(Item.class, id);			  
		if(i==null) {															
			System.out.println("Item not found");
		}else {
			tran.begin();
			manager.remove(i);						
			tran.commit();
			System.out.println("Item deleted successfully");
		}
	}
	
	public void updateItem(Item ii) {
		EntityManager manager=db.getEntityManager();			 
		EntityTransaction tran = manager.getTransaction();
		Item i	= manager.find(Item.class, ii.getItemid());		
		if(i==null) {
			System.out.println("Item not found");
		}else {
			tran.begin();
			i.setItemname(ii.getItemname());
			manager.persist(i);									
			tran.commit();
			System.out.println("Item updated successfully");
		}
	}
}
