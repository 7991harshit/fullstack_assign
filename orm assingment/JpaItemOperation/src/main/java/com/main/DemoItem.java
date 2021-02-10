package com.main;

import java.util.List;

import com.bean.Item;
import com.dao.ItemDao;


public class DemoItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDao id=new ItemDao();
		/* List<Item> listOfItem=id.getAllItem();
		System.out.println("Number of items : "+listOfItem.size());
		for(Item ii:listOfItem){
			System.out.println(ii);
		} */
		
		/* Item i1 = new Item();
		i1.setItemid(100);
		i1.setItemname("Laptop");
		id.storeItem(i1); */  
		
		//id.deleteItem(100);
		
		Item i = new Item();
		i.setItemid(100);
		i.setItemname("Computer");
		id.updateItem(i); 
	}

}
