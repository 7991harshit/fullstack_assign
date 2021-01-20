import java.util.*;
class MyException extends Exception{
	MyException(){
		super();
	}
	MyException(String msg){
		super(msg);
	}
}
interface Bank{
	void withdraw();
	void deposit();
	void checkBalance(); 
}
abstract class AccInitialization{
	int newaccno,facc,not,i=0,taccno,faccno;
	String newname;
	double newamount;
	static int accCount=1;
	Account accounts[]=new Account[10];
	Account acc=new Account();
	AccInitialization(){
		accounts[i]=new Account();
		accounts[i].setAccno(1010);
		accounts[i].setName("Unknown");
		accounts[i].setAmount(500);
	}
	void readDacc(){
		System.out.println("Account Number:"+accounts[i].getAccno());
		System.out.println("Account Holder Name:"+accounts[i].getName());
		System.out.println("Account Balance:"+accounts[i].getAmount());
	}
	void accCreate(String newname,double newamount){
		newaccno=1010+accCount;
		this.newaccno=newaccno;
		try{
		if(newamount>500){
			try{
			if(accCount<10){
				accounts[accCount]=new Account();
				accounts[accCount].setAccno(newaccno);
				accounts[accCount].setName(newname);
				accounts[accCount].setAmount(newamount);
				accCount++;	
				System.out.println("Account created with account number: "+newaccno);
			}
			else{
				throw new MyException("MaximumAccountCreationException");
			}
			}
			catch(Exception e){
				System.out.println(e.toString());
				System.out.println("Maximum account limit reached");
			}
		}
		else{
			throw new MyException("MinimumBalanceException");
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.out.println("Minimun balance must be greater than 500.0");
		}
	}
	void readAcc(int facc){
		this.facc=facc;
		try{
		for(int j=0;j<accCount;j++){
			if(accounts[j].getAccno()==facc){
				System.out.println("Account Details:");
				System.out.println("Account Number:"+accounts[j].getAccno());
				System.out.println("Account Holder Name:"+accounts[j].getName());
				not=0;
				break;
			}
			else{
			not=1;
			}
		}
		if(not==1){
			throw new MyException("InvalidAccountException");
		}
		}
		catch(Exception e){
				System.out.println(e.toString());
				System.out.println("Check your account number and try again");
		}
	}
	abstract void transfer();
}
class MyBank extends AccInitialization implements Bank{
	Scanner in=new Scanner(System.in);
	int f,t;
	double damount,wamount,sum,rem,total,tamount;
	public void deposit(){
		System.out.println("Enter your account number");
		newaccno=in.nextInt();
		System.out.println("Enter the amount you want to deposit");
		damount=in.nextDouble();
		try{
		for(int j=0;j<accCount;j++){
			if(accounts[j].getAccno()==newaccno){
				try{
				if(damount<=50000){
				sum=accounts[j].getAmount();
				sum=sum+damount;
				accounts[j].setAmount(sum);
				System.out.println("Transaction Succesful");
				}
				else{
					throw new MyException("MaximumAmountCreditException");
					}
				}
				catch(Exception e){
					System.out.println(e.toString());
					System.out.println("Cannot deposit more than 50000.0");
				}
				not=0;
				break;
			}
			else{
			not=1;
			}
		}
		if(not==1){
			throw new MyException("InvalidAccountException");
		}
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.out.println("Check your account number and try again");
		}
	} 
	public void withdraw(){
		System.out.println("Enter your account number");
		newaccno=in.nextInt();
		System.out.println("Enter the amount you want to withdraw");
		wamount=in.nextDouble();
		try{
		for(int j=0;j<accCount;j++){
			if(accounts[j].getAccno()==newaccno){
				total=accounts[j].getAmount();
				rem=total-wamount;
				try{
				if(rem>=500){
				accounts[j].setAmount(rem);
				System.out.println("Transaction Successful");
				}
				else{
					throw new MyException("MinimumBalanceMaintainException");
					}
				}
				catch(Exception e){
					System.out.println(e.toString());
					System.out.println("Cannot withdraw this amount inorder to maintain a minimum balance");
				}
				not=0;
				break;
			}
			else{
			not=1;
			}
		}
		if(not==1){
			throw new MyException("InvalidAccountException");
		}
		}
			catch(Exception e){
				System.out.println(e.toString());
				System.out.println("Check your account number and try again");
			}
	}
	public void checkBalance(){
		System.out.println("Enter your account number");
		newaccno=in.nextInt();
		try{
		for(int j=0;j<accCount;j++){
			if(accounts[j].getAccno()==newaccno){
				System.out.println("Your balance is:"+accounts[j].getAmount());
				not=0;
				break;
			}
			else{
			not=1;
			}
		}
		if(not==1){
			throw new MyException("InvalidAccountException");
		}
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.out.println("Check your account number and try again");
		}
	}
	void transfer(){
		System.out.println("Enter the account number you want to transfer the amount in");
		taccno=in.nextInt();
		System.out.println("Enter your account number");
		faccno=in.nextInt();
		try{
		for(int j=0;j<accCount;j++){
			if(accounts[j].getAccno()==faccno){
				total=accounts[j].getAmount();
				f=j;
				not=0;
				break;
			}
			else{
			not=1;
			}
		}
		if(not==1){
			throw new MyException("InvalidAccountException");
		}
		else{
			try{
			for(int j=0;j<accCount;j++){
			if(accounts[j].getAccno()==taccno){
				t=j;
				if(taccno==faccno){
					System.out.println("Cannot transfer into same account");
				}
				else{
					System.out.println("Enter the amount you want to transfer");
					tamount=in.nextDouble();
					rem=total-tamount;
					if(rem>=500){
						accounts[f].setAmount(rem);
						sum=accounts[t].getAmount();
						sum=sum+tamount;
						accounts[t].setAmount(sum);
						System.out.println("Transaction Successful");
					}
					else{System.out.println("Not sufficient amount to transfer");}
				}
				not=0;
				break;
			}
			else{
			not=1;
			}
		}
		if(not==1){
			throw new MyException("InvalidAccountException");
		} 
			}
			catch(Exception e){
				System.out.println(e.toString());
				System.out.println("Check account number");
			}
		}
	}catch(Exception e){
		System.out.println(e.toString());
		System.out.println("Check account number");
	}
	} 
}
class Account{
	private int accno;
	private String name;
	private double amount;
	public void setAccno(int accno){
		this.accno=accno;
	}
	public void setName(String name){
		this.name=name;
	}
	void setAmount(double amount){
		this.amount=amount;
	}
	public int getAccno(){
		return accno;
	}
	public String getName(){
		return name;
	}
	public double getAmount(){
		return amount;
	}
}
class BankTest{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int myaccno,flag=1;
		String myname;
		double myamount;
		double mydamount;
		MyBank my=new MyBank();
		do{
			System.out.println("Welcome to myBank");
			System.out.println("1.Create Account");
			System.out.println("2.See Details");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit");
			System.out.println("5.Transfer");
			System.out.println("6.Check Balance");
			System.out.println("7.Exit");
			int n=in.nextInt();
			switch(n){
				case 1:
					do{
						System.out.println("Default Account:");
						my.readDacc();
						System.out.println("1.Create");
						System.out.println("2.Exit");
						int n1=in.nextInt();
						switch(n1){
							case 1:
							System.out.println("Enter your name");
							myname=in.next();
							System.out.println("Enter opening amount");
							myamount=in.nextDouble();
							my.accCreate(myname,myamount);
							break;
							case 2:
							break;
							default:
							System.out.println("Please choose from the available options");
							break;
						}
					}while(false);
				break;
				case 2:
				System.out.println("Enter your account number");
				myaccno=in.nextInt();
				my.readAcc(myaccno);
				break;
				case 3:
				my.withdraw();
				break;
				case 4:
				my.deposit();
				break;
				case 5:
				my.transfer();
				break;
				case 6:
				my.checkBalance();
				break;
				case 7:
				flag=0;
				System.out.println("Thankyou for using myBank");
				break;
				default:
				System.out.println("Please choose from the available options");
				break;
			}
		}while(flag!=0);
	}
}