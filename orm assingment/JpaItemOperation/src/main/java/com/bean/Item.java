package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	private int itemid;
	private String itemname;
	
	public int getItemid() {
		return itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + "]";
	}
	
}
