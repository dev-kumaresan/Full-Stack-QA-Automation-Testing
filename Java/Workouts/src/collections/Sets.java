package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
       Set<Integer> s = new HashSet<>();
       s.add(12);
       s.add(45);
       s.add(44);
       s.add(2);
       
       
//       for(Integer s1 : s)
//       {
//    	   System.out.println(s1);
//       }
       
//       System.out.println(s);
       
       Iterator<Integer> i = s.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
  
 
     
    	   
       

	}

}
