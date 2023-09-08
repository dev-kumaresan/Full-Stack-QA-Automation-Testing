package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
      List<Integer> l1 = new ArrayList<>();
      l1.add(20);
      l1.add(30);
      
      l1.add(50);
      l1.add(60);
      l1.add(40);
      
//      for(Integer l : l1)
//      {
//    	  System.out.println(l);
//      }
      
      for(int i=0;i<l1.size();i++)
      {
    	  System.out.println(l1.get(i));
      }
      
//      Set<Integer> s = new TreeSet<>();
//      s.addAll(l1);
//      System.out.println(s);
      //      l1.add(1, 40);
//      l1.remove(0);
//      System.out.println(l1);
      
//      System.out.println(l1.get(2));

	}

}
