import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class RemoveDuplicateId {
   public static void main(String[] args) {
	   Employee e1 = new Employee(1, "garima", "Consultant");
	   Employee e2 = new Employee(2, "ankur","Risk engineer");
	   Employee e3 = new Employee(1, "mahajan","lead");
	  
	   ArrayList<Employee> list = new ArrayList<Employee>();
	   list.add(e1);
	   list.add(e2);
	   list.add(e3);
	   System.out.println(list);
	
	   TreeSet<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.id == e2.id)
				return 0;
			else {
				 return e1.name.compareTo(e2.name);
			}
				
		}
	}) ;
	   set.addAll(list);
	   System.out.println("set------");
	   System.out.println(set);
}
}
