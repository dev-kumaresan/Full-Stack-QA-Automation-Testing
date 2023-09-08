package workouts.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTraining {

	public static void main(String[] args) {
		Map<Integer,String> names =  new HashMap<>();
		names.put(1, "Kumaresan");
		names.put(2, "sujatha");
		names.put(3, "murugan");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key and value to add : ");
		Integer key = sc.nextInt();
		sc.nextLine();
		String value = sc.next();
		names.put(key, value);
		System.out.println(names);
		if(names.containsKey(key) && names.containsValue(value))
		{
		names.remove(key, value);
		names.put(5,"raja");
		}
		System.out.println("Enter Key to remove : ");
		Integer key1 = sc.nextInt();
		if(names.containsKey(key1))
		{
			System.out.println(names.remove(key1));
		}
		

		
		//		System.out.println(names);
		
		Set<Entry<Integer,String>> entryset = names.entrySet();
		
		for(Entry<Integer,String> entry : entryset)
		{
			System.out.println("Key : "+entry.getKey()+"\nValue : "+entry.getValue()+"\n");
			
		}

	}

}
