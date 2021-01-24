import java.util.*;
class StrAssing{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n=in.nextInt();
		String string[]=new String[n];
		in.nextLine();
		for(int i=0;i<n;i++){
			string[i]=in.nextLine();
		}
		String temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(string[i].compareTo(string[j])>0){
					temp=string[i];
					string[i]=string[j];
					string[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(string));
	}
}