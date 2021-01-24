package comp;

import java.util.Comparator;

public class NameDsc implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){  
		return e2.name.compareTo(e1.name);
		} 
}
