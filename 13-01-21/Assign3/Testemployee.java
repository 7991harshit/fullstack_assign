import java.util.*;
class Employeedetails{
	int n;
	double hra;
	double da;
	double pf;
	double b;
	int id[];
	String name[];
	double salary[];
	String desig[];
	Employeedetails(int n){
		this.n=n;
		id=new int[n];
		name=new String[n];
		salary=new double[n];
		desig=new String[n];
		hra=0.1;
		da=0.07;
		pf=0.05;
	}
	void read(){
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n;i++){
		System.out.println("Enter "+(i+1)+"st id");
		id[i]=in.nextInt();
		System.out.println("Enter "+(i+1)+"st name");
		name[i]=in.next();
		System.out.println("Enter "+(i+1)+"st salary");
		salary[i]=in.nextDouble();
		System.out.println("Enter "+(i+1)+"st designation");
		desig[i]=in.next();
		}
	}
	void calsalary(){
		for(int i=0;i<n;i++){
			salary[i]=salary[i]+hra*salary[i]+da*salary[i]-pf*salary[i];
		}
	}
	void bonus(){
		for(int i=0;i<n;i++){
			if(desig[i].equals("manager")){
				b=0.15;
				salary[i]=salary[i]+b*salary[i];
			}
			else if(desig[i].equals("developer")){
				b=0.1;
				salary[i]=salary[i]+b*salary[i];
			}
			else{
				b=0.05;
				salary[i]=salary[i]+b*salary[i];
			} 
		}
	}
	void display(){
		System.out.println("Details are:");
		System.out.println("id"+"    "+"name"+"    "+"salary"+"    "+"designation");
		for(int i=0;i<n;i++){
			System.out.println(id[i]+"    "+name[i]+"    "+salary[i]+"    "+desig[i]);
		}
	}
}
class Testemployee{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of records");
		int n1=in.nextInt();
		Employeedetails emp=new Employeedetails(n1);
		emp.read();
		emp.calsalary();
		emp.bonus();
		emp.display();
	}
}