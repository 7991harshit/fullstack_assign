package comp;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1,"harshit",10000));
		al.add(new Employee(6,"anil",20000));
		al.add(new Employee(3,"arpit",30000));
		System.out.println("Sorting by id ascending order");
		Collections.sort(al,new IdAsc());
		for(Employee em:al){
			System.out.println(em.id+" "+em.name+" "+em.salary);
		}
		System.out.println("Sorting by id descending order");
		Collections.sort(al,new IdDsc());
		for(Employee em:al){
			System.out.println(em.id+" "+em.name+" "+em.salary);
		}
		System.out.println("Sorting by name ascending order");
		Collections.sort(al,new NameAsc());
		for(Employee em:al){
			System.out.println(em.id+" "+em.name+" "+em.salary);
		}
		System.out.println("Sorting by name descending order");
		Collections.sort(al,new NameDsc());
		for(Employee em:al){
			System.out.println(em.id+" "+em.name+" "+em.salary);
		}
		System.out.println("Sorting by salary ascending order");
		Collections.sort(al,new SalAsc());
		for(Employee em:al){
			System.out.println(em.id+" "+em.name+" "+em.salary);
		}
		System.out.println("Sorting by salary descending order");
		Collections.sort(al,new SalDsc());
		for(Employee em:al){
			System.out.println(em.id+" "+em.name+" "+em.salary);
		}
	}

}
