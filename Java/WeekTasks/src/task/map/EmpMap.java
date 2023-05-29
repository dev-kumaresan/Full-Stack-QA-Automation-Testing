package task.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class EmpMap {

	public static void main(String[] args) {
		
		Map<String,Emp> details = new TreeMap<>();
		
		for(int i=0;i<10;i++)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter emp id : ");
			String empId = s.next();
			System.out.println("Enter name : ");
			String name = s.next();
			System.out.println("Enter Phone : ");
			String phone = s.next();
			System.out.println("Enter address : ");
			String address = s.next();
			System.out.println("Enter dob : ");
			String dob = s.next();
			System.out.println("Enter doj : ");
			String doj = s.next();
			System.out.println("Enter email : ");
			String eMail = s.next();
			System.out.println("Enter gender : ");
			String gender = s.next();
			System.out.println("Enter emp Salary : ");
			String sal = s.next();
			
			Emp e = new Emp(empId, name, phone, address, dob, doj, eMail, gender, sal);
			details.put(empId, e);
		}
		
		for(Entry<String,Emp> entry : details.entrySet())
		{
			String key = entry.getKey();
			Emp value = entry.getValue();
			System.out.println("{"+key+","+value.toString()+"}");
		}
		
	}		

}
