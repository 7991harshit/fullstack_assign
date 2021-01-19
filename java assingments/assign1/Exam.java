import java.util.*;
class Exam{
	public static void main(String args[]){
		int a,b,c,x,flag=0,sum=0,total=0,z1=0,z2=0,z3=0;
		Scanner in=new Scanner(System.in);
		System.out.println("welcome to online examination");
		System.out.println("choose which exam you want to take first");
		do{
			System.out.println("1.for english exam");
			System.out.println("2.for maths exam");
			System.out.println("3.for gk exam");
			int n=in.nextInt();
			switch(n){
				case 1:
				if(z1!=1){
				System.out.println("There are three questions and each question have three options and you have to choose any one for the correct answer");
				System.out.println("Question 1.She works.....Saturday");
				System.out.println("options:");
				System.out.println("1.at");
				System.out.println("2.in");
				System.out.println("3.on");
				a=in.nextInt();
				if(a==3){
					a=10;
				}else{a=0;}
				System.out.println("Question 2.I stay at home.....the morning");
				System.out.println("options:");
				System.out.println("1.at");
				System.out.println("2.in");
				System.out.println("3.on");
				b=in.nextInt();
				if(b==2){
					b=10;
				}else{b=0;}
				System.out.println("Question 3.He passed his English exam very.....");
				System.out.println("options:");
				System.out.println("1.easy");
				System.out.println("2.good");
				System.out.println("3.easily");
				c=in.nextInt();
				if(c==3){
					c=10;
				}else{c=0;}
				sum=sum+a+b+c;
				System.out.println("your marks:"+sum);
				flag++;
				z1=1;
				break;
				}else{System.out.println("You have already attempted english test");
					break;}
				case 2:
				if(z2!=2){
				System.out.println("There are three questions and each question have three options and you have to choose any one for the correct answer");
				System.out.println("Question 1.50 times 5 is equal to");
				System.out.println("options:");
				System.out.println("1.2500");
				System.out.println("2.500");
				System.out.println("3.250");
				a=in.nextInt();
				if(a==3){
					a=10;
				}else{a=0;}
				System.out.println("Question 2.90/10");
				System.out.println("options:");
				System.out.println("1.9");
				System.out.println("2.10");
				System.out.println("3.1");
				b=in.nextInt();
				if(b==1){
					b=10;
				}else{b=0;}
				System.out.println("Question 3.26+32-12");
				System.out.println("options:");
				System.out.println("1.32");
				System.out.println("2.46");
				System.out.println("3.56");
				c=in.nextInt();
				if(c==2){
					c=10;
				}else{c=0;}
				sum=sum+a+b+c;
				System.out.println("your marks:"+sum);
				flag++;
				z2=2;
				break;
				}else{System.out.println("You have already attempted maths test");
				break;}
				case 3:
				if(z3!=3){
				System.out.println("There are three questions and each question have three options and you have to choose any one for the correct answer");
				System.out.println("Question 1.Who invented the Light Bulb?");
				System.out.println("options:");
				System.out.println("1.Thomas Alva Edison");
				System.out.println("2.Elon Musk");
				System.out.println("3.Sundar Pichai");
				a=in.nextInt();
				if(a==1){
					a=10;
				}else{a=0;}
				System.out.println("Question 2.which is the smallest planet in the solar system?");
				System.out.println("options:");
				System.out.println("1.Jupiter");
				System.out.println("2.Earth");
				System.out.println("3.Mercury");
				b=in.nextInt();
				if(b==3){
					b=10;
				}else{b=0;}
				System.out.println("Question 3.Who invented the computer");
				System.out.println("options:");
				System.out.println("1.Charles Babbage");
				System.out.println("2.James Gosling");
				System.out.println("3.Bill Gates");
				c=in.nextInt();
				if(c==1){
					c=10;
				}else{c=0;}
				sum=sum+a+b+c;
				System.out.println("your marks:"+sum);
				flag++;
				z3=3;
				break;
				}else{System.out.println("You have already attempted gk test");
				break;}
				default:
				System.out.println("please choose from the available options");
			}
			total=total+sum;
			sum=0;
			a=0;
			b=0;
			c=0;
			System.out.println("Do you wish to continue..");
			System.out.println("1.Yes");
			System.out.println("2.No");
			x=in.nextInt();
			if(flag==3){
				if(x==1){System.out.println("You have taken all the exams.. Thankyou");}
				else{System.out.println("Thankyou");}
			}
			else{
				if(x==2){System.out.println("please attend all the exams");}
			}
		}while(flag!=3);
		if(total>=70){
			total=total+10;
			if(total>=90){
				System.out.println("Congratulations.. You are selected");
				System.out.println("Your result is:"+total);
			}
			else{
				System.out.println("Try Again");
			}
		}
		else{
			System.out.println("Try Again");
		}
	}
}