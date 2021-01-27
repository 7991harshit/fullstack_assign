package main;

import java.util.Scanner;
import bean.Product;
import productservice.ProductService;

public class ProductTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int mypid,flag=0,count=101;
		String mypname;
		float myprice;
		ProductService ps=new ProductService();	
		Product p;
		do{
			System.out.println("Welcome to product services");
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Check Product Details");
			System.out.println("5.Check Product Price");
			System.out.println("6.Exit");
			int n=in.nextInt();
			switch(n){
			case 1:
				System.out.println("Enter Product name and Price");
				mypid=count++;
				mypname=in.next();
				myprice=in.nextFloat();
				p=new Product(mypid,mypname,myprice);
				ps.addProduct(p);
				System.out.println("Product created with Pid:"+p.getPid());
				break;
			case 2:
				System.out.println("Enter Pid");
				mypid=in.nextInt();
				ps.updateProduct(mypid);
				break;
			case 3:
				System.out.println("Enter Pid");
				mypid=in.nextInt();
				ps.deleteProduct(mypid);
				break;
			case 4:
				System.out.println("Product Details:");
				System.out.println(ps.display());
				break;
			case 5:
				System.out.println("Enter Pid");
				mypid=in.nextInt();
				ps.productPrice(mypid);
				break;
			case 6:
				flag=1;
				break;
			}
		}while(flag!=1);
	}
}
