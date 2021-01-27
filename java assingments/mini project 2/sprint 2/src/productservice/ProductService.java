package productservice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import bean.Product;

public class ProductService {
	int id,flag=0;
	float uprice;
	Scanner in = new Scanner(System.in);
	ArrayList<Product> al = new ArrayList<Product>();
	public void addProduct(Product p) {
		for(Product p1:al){
			if(p1.getPid()==p.getPid()){
				flag=1;
				break;
			}
			else{
				flag=0;
			}
		}
		if(flag==1){
			System.out.println("Product already exists");
		}
		else{
			al.add(p);
			System.out.println("Product created with Product Id:"+p.getPid());
		}
	}
	public void updateProduct(int id){
		this.id=id;
		for(Product p:al){
			if(p.getPid()==id){
				System.out.println("Enter the updated price");
				uprice=in.nextFloat();
				p.setPrice(uprice);
				System.out.println("Price updated successfully");
				flag=1;
				break;
			}
			else{
				flag=0;
			}
		}
		if(flag==0){
			System.out.println("Product not found");
		}
	}
	public void deleteProduct(int id){
		this.id=id;
		int i=0;
		for(Product p:al){
			if(p.getPid()==id){
				al.remove(i);
				System.out.println("Product deleted successfully");
				flag=1;
				break;
			}
			else{
				i++;
				flag=0;
			}
		}
		if(flag==0){
			System.out.println("Product not found");
		}
	}
	public ArrayList<Product> display(){
		return al;
	}
	public void productPrice(int id){
		this.id=id;
		for(Product p:al){
			if(p.getPid()==id){
				System.out.println("Price:"+p.getPrice());
				flag=1;
				break;
			}
			else{
				flag=0;
			}
		}
		if(flag==0){
			System.out.println("Product not found");
		}
	}
	public void serial(){
		 try
	        {
	            FileOutputStream fos = new FileOutputStream("productData");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(al);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
	}
	public void deSerial(){
		 try
	        {
	            FileInputStream fis = new FileInputStream("productData");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	 
	            al = (ArrayList) ois.readObject();
	 
	            ois.close();
	            fis.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	            return;
	        } 
	        catch (ClassNotFoundException c) 
	        {
	            System.out.println("Class not found");
	            c.printStackTrace();
	            return;
	        }
	}
}

