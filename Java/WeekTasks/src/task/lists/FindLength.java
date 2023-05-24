package task.lists;

import java.util.ArrayList;
import java.util.List;

public class FindLength {

	public static void main(String[] args) {
		 List<Integer> list1 = new ArrayList<>();
	        list1.add(10);
	        list1.add(20);
	        list1.add(30);
	        list1.add(40);
	        list1.add(50);
	        list1.add(60);
	        list1.add(70);
	        list1.add(80);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(100);
	        list2.add(200);
	        list2.add(300);
	        list2.add(400);
	        list2.add(500);
	        list2.add(600);
	        list2.add(700);
	        list2.add(8000);

	        List<Integer> newList = new ArrayList<>(list1); 
	        newList.removeAll(list2); 

	        System.out.println(newList);
	
	
   
//-------------------------------------------------------------------
//		List<Integer> elements = new Vector();
//		elements.add(105);
//		elements.add(205);
//		elements.add(305);
//		elements.add(405);
//		elements.add(505);
//		elements.add(605);
//		elements.add(705);
//		elements.add(805);
//		System.out.println("The length of elements is "+elements.size());
//---------------------------------------------------------------------
//		List<Integer> elements = new LinkedList();
//		elements.add(100);
//		elements.add(200);
//		elements.add(300);
//		elements.add(400);
//		elements.add(500);
//		elements.add(600);
//		elements.add(700);
//		System.out.println("The length of elements is "+elements.size());
//-----------------------------------------------------------------------
//		List<Integer> elements = new ArrayList();
//		elements.add(10);
//		elements.add(20);
//		elements.add(30);
//		elements.add(90);
//		elements.add(10);
//		elements.add(10);
//		elements.add(40);
//		elements.add(50);
//		System.out.println("The length of elements is "+elements.size());

	}}


