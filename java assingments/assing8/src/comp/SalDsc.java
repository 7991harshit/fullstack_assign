package comp;

import java.util.Comparator;

public class SalDsc implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2){  
		if(e1.salary==e2.salary)  
		return 0;  
		else if(e1.salary<e2.salary)  
		return 1;  
		else  
		return -1;  
		}  
}
