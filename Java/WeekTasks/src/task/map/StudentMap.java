package task.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

class StudentMap {

	public static void main(String[] args) {

		Map<String,Student> details = new TreeMap<>();
		
		for(int i=0;i<10;i++)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter emp id : ");
			String stdId = s.next();
			System.out.println("Enter name : ");
			String stdName = s.next();
			System.out.println("Enter Phone : ");
			String stdPhone = s.next();
			System.out.println("Enter address : ");
			String address = s.next();
			System.out.println("Enter dob : ");
			String dOB = s.next();
			System.out.println("Enter email : ");
			String eMail = s.next();
			System.out.println("Enter gender : ");
			String gender = s.next();
			
			
			Student s1 = new Student(stdId, stdName, stdPhone, address, dOB,  eMail, gender);
			details.put(stdId, s1);
		}
		
		for(Entry<String,Student> entry : details.entrySet())
		{
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println("{"+key+","+value.toString()+"}");
		}
		

	}

}
