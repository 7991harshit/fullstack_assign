import java.util.*;
class Company{
	public static void main(String args[]){
		double hra=0.1,da=0.07,pf=0.05,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of records");
		int n=in.nextInt();
		int id[]=new int[n];
		String name[]=new String[n];
		double salary[]=new double[n];
		String desig[]=new String[n];
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
		for(int i=0;i<n;i++){
			if(desig[i].equals("manager")){
				b=0.15;
				salary[i]=salary[i]+hra*salary[i]+da*salary[i]-pf*salary[i]+b*salary[i];
			}
			else if(desig[i].equals("developer")){
				b=0.1;
				salary[i]=salary[i]+hra*salary[i]+da*salary[i]-pf*salary[i]+b*salary[i];
			}
			else{
				b=0.05;
				salary[i]=salary[i]+hra*salary[i]+da*salary[i]-pf*salary[i]+b*salary[i];
			} 
		}
		System.out.println("Details are:");
		System.out.println("id"+"    "+"name"+"    "+"salary"+"    "+"designation");
		for(int i=0;i<n;i++){
			System.out.println(id[i]+"    "+name[i]+"    "+salary[i]+"    "+desig[i]);
		}
	}
}
