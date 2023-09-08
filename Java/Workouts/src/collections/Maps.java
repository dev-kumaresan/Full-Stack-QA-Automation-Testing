package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {

		Map<String,Integer> fruits = new HashMap<>();
		
		
		fruits.put("Grapes",3);
		fruits.put("Orange",4);
		fruits.put("Apple",1);
		System.out.println(fruits);
	
		Set<String> KeySet = fruits.keySet();
		for(String ks : KeySet)
		{
			System.out.println(ks);
		}
		
		Collection<Integer> value = fruits.values();
		for(Integer v : value)
		{
			System.out.println(v);
		}
		Set<Entry<String,Integer>> entrySet = fruits.entrySet();
		for(Entry<String,Integer> es : entrySet)
		{
			System.out.println(es);
		}
		
		
		
		
		
	}

}
