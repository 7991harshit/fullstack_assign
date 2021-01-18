import java.util.*;
class Student{
	Scanner in=new Scanner(System.in);
	int sid;
	String sname;
	int age;
	int marks[]=new int[4];
	int avg;
	void read(){
		System.out.println("Enter id");
		sid=in.nextInt();
		System.out.println("Enter name");
		sname=in.next();
		System.out.println("Enter age");
		age=in.nextInt();
		System.out.println("Enter the marks of four subjects");
		for( int i=0;i<4;i++){
			marks[i]=in.nextInt();
		}
	}
	void Calgrade(){
		int avg=0;
		for( int i=0;i<4;i++){
			avg=avg+marks[i];
		}
		avg=avg/4;
		if(avg>90){}
		else if(avg>90){System.out.println("Your grade is:A+");}
		else if(avg>80){System.out.println("Your grade is:B");}
		else if(avg>70){System.out.println("Your grade is:C");}
		else if(avg>55){System.out.println("Your grade is:D");}
		else{System.out.println("Your grade is:D");}
	}
	void display(){
		System.out.println("id:"+sid);
		System.out.println("name:"+sname);
		System.out.println("age:"+age);
		System.out.println("grade:"+avg);
	}
}
class Studenttest extends Student{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no records");
		int n=in.nextInt();
		Student std[]=new Student[n];
		for(int i=0;i<n;i++){
			std[i]=new Student();
			std[i].read();
		}
		for(int i=0;i<n;i++){
			std[i]=new Student();
			std[i].Calgrade();
		}
		for(int i=0;i<n;i++){
			std[i]=new Student();
			std[i].display();
		}
	}
}
