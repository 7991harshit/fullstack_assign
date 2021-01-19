import java.util.*;
class Employee{
	Scanner in=new Scanner(System.in);
	Address add=new Address();
	int id;
	String name;
	double salary;
	double hra=0.1;
	double da=0.07;
	double pf=0.05;
	void read(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter id");
		id=in.nextInt();
		System.out.println("Enter name");
		name=in.next();
		System.out.println("Enter salary");
		salary=in.nextDouble();
	}
	void calsalary(){
		salary=salary+hra*salary+da*salary-pf*salary;
		display();
	}
	 void display(){
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
}
class Manager extends Employee{
	int n;
	void readMgr(){
		System.out.println("Enter no of employees under him");
		n=in.nextInt();
		add.readAdd();
	}
	void desMgr(){
		readMgr();
		System.out.println("Manager details:");
		System.out.println("employees:"+n);
		add.disAdd();
	}
}
class Programmer extends Employee{
	String proj;
	void readPrg(){
		System.out.println("Enter the project name");
		proj=in.nextLine();
		add.readAdd();
	}
	void disPrg(){
		readPrg();
		System.out.println("Programmer details");
		System.out.println("Project:"+proj);
		add.disAdd();
	}
}
class Address{
	Scanner in=new Scanner(System.in);
	int pin;
	String city,state;
	void readAdd(){
		System.out.println("Enter city");
		city =in.nextLine();
		System.out.println("Enter state");
		state=in.nextLine();
		System.out.println("Enter pin");
		pin=in.nextInt();
	}
	void disAdd(){
		System.out.println("Address details:");
		System.out.println("city:"+city);
		System.out.println("state:"+state);
		System.out.println("pin:"+pin);
	}
}
class EmployeeTest{
	public static void main(String args[]){
		Manager mgr=new Manager();
		Programmer prg=new Programmer();
		mgr.read();
		mgr.calsalary();
		mgr.desMgr();
		prg.read();
		prg.calsalary();
		prg.disPrg();
	}
}