package bean;
import java.io.Serializable;

public class Product implements Serializable{
	private int pid;
	private String pname;
	private float price;

	public Product(int pid, String pname, float price) {
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}
