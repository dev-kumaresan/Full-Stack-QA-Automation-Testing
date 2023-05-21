package aiite.smalltasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Grouping {

	public static void main(String[] args) {
		List<Object> emp_detail = new ArrayList();
		emp_detail.add("Kumaresan");
		emp_detail.add(101);
		emp_detail.add(25);
		emp_detail.add(70.4);
		
		Set<Object> update_details = new HashSet(emp_detail); //List to set - one way
		System.out.println(update_details);
		update_details.add("Gowtham");
		update_details.add(102);
		update_details.add(25);
		update_details.add(70.5);
		update_details.addAll(emp_detail); // second way - with remove duplicates
		System.out.println(update_details);
		

	}

}
