package task.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_2 {

	public void q1p1() {
		Map<Integer, String> m1 = new HashMap();
		m1.put(10, "java");
		m1.put(20, "sql");
		m1.put(30, "oops");
		m1.put(40, "Sql");
		m1.put(50, "oracle");
		m1.put(60, "DB");
		m1.put(10, "selenium");
		m1.put(50, "psql");
		m1.put(40, "Hadoop");
		System.out.println(m1);
	}

	public void q1p2() {
		Map<Integer, Integer> m2 = new LinkedHashMap();
		m2.put(10, 10);
		m2.put(20, 20);
		m2.put(30, 30);
		m2.put(40, 40);
		m2.put(50, 50);
		m2.put(60, 60);
		m2.put(10, 10);
		m2.put(50, 50);
		m2.put(40, 40);
		System.out.println(m2);
	}

	public void q1p3() {
		Map<Character, Integer> m3 = new TreeMap();
		m3.put('!', 10);
		m3.put('@', 20);
		m3.put('#', 30);
		m3.put('$', 40);
		m3.put('%', 50);
		m3.put('^', 60);
		m3.put('&', 10);
		m3.put('*', 50);
		m3.put('(', 40);
		System.out.println(m3);
	}

	public void q1p4() {
		Hashtable<String, String> m4 = new Hashtable<>();
		m4.put("vel", "Selenium");
		m4.put("Ganesh", "framework");
		m4.put("Dinesh", "oracle");
		m4.put("Vengat", "corejava");
		m4.put("subash", "jira");
		System.out.println(m4);
	}

	public void q2p1() {
		Map<Integer, String> m5 = new HashMap();
		m5.put(10, "java");
		m5.put(20, "sql");
		m5.put(30, "oops");
		m5.put(40, "Sql");
		m5.put(50, "oracle");
		m5.put(60, "DB");
		m5.put(10, "selenium");
		m5.put(50, "psql");
		m5.put(40, "Hadoop");
		for (Integer key : m5.keySet()) {
			System.out.println("Key: " + key);
		}

	}

	public void q2p2() {
		Map<Integer, Integer> m6 = new LinkedHashMap();
		m6.put(10, 10);
		m6.put(20, 20);
		m6.put(30, 30);
		m6.put(40, 40);
		m6.put(50, 50);
		m6.put(60, 60);
		m6.put(10, 10);
		m6.put(50, 50);
		m6.put(40, 40);
		for (Integer Key : m6.keySet()) {
			System.out.println("Key : " + Key);
		}

	}

	public void q2p3() {
		Map<Character, Integer> m7 = new TreeMap();
		m7.put('!', 10);
		m7.put('@', 20);
		m7.put('#', 30);
		m7.put('$', 40);
		m7.put('%', 50);
		m7.put('^', 60);
		m7.put('&', 10);
		m7.put('*', 50);
		m7.put('(', 409);
		for (Character Key : m7.keySet()) {
			System.out.println("Key :" + Key);
		}
	}

	public void q2p4() {
		Hashtable<String, String> m8 = new Hashtable<>();
		m8.put("vel", "Selenium");
		m8.put("Ganesh", "framework");
		m8.put("Dinesh", "oracle");
		m8.put("Vengat", "corejava");
		m8.put("subash", "jira");
		for (String key : m8.keySet()) {
			System.out.println(key);
		}
	}

	public void q3p1() {
		Map<Integer, String> m5 = new HashMap();
		m5.put(10, "java");
		m5.put(20, "sql");
		m5.put(30, "oops");
		m5.put(40, "Sql");
		m5.put(50, "oracle");
		m5.put(60, "DB");
		m5.put(10, "selenium");
		m5.put(50, "psql");
		m5.put(40, "Hadoop");
		for (String values : m5.values()) {
			System.out.println("Values: " + values);
		}
	}

	public void q3p2() {
		Map<Integer, Integer> m6 = new LinkedHashMap();
		m6.put(10, 10);
		m6.put(20, 20);
		m6.put(30, 30);
		m6.put(40, 40);
		m6.put(50, 50);
		m6.put(60, 60);
		m6.put(10, 10);
		m6.put(50, 50);
		m6.put(40, 40);
		for (Integer Values : m6.values()) {
			System.out.println("Values : " + Values);
		}
	}

	public void q3p3() {
		Map<Character, Integer> m11 = new TreeMap();
		m11.put('!', 10);
		m11.put('@', 20);
		m11.put('#', 30);
		m11.put('$', 40);
		m11.put('%', 50);
		m11.put('^', 60);
		m11.put('&', 10);
		m11.put('*', 50);
		m11.put('(', 409);
		for (Integer Values : m11.values()) {
			System.out.println("Values :" + Values);
		}
	}

	public void q3p4() {
		Hashtable<String, String> m8 = new Hashtable<>();
		m8.put("vel", "Selenium");
		m8.put("Ganesh", "framework");
		m8.put("Dinesh", "oracle");
		m8.put("Vengat", "corejava");
		m8.put("subash", "jira");
		for (String key : m8.keySet()) {
			System.out.println(key);
		}
	}

	public void q4p1() {
		HashMap<Integer, String> m12 = new HashMap();

		m12.put(10, "java");
		m12.put(20, "sql");
		m12.put(30, "oops");
		m12.put(40, "Sql");
		m12.put(50, "oracle");
		m12.put(60, "DB");
		m12.put(10, "selenium");
		m12.put(50, "psql");
		m12.put(40, "Hadoop");

		for (Map.Entry<Integer, String> entry : m12.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}

	public void q4p2() {
		Map<Integer, Integer> m13 = new LinkedHashMap();
		m13.put(10, 10);
		m13.put(20, 20);
		m13.put(30, 30);
		m13.put(40, 40);
		m13.put(50, 50);
		m13.put(60, 60);
		m13.put(10, 10);
		m13.put(50, 50);
		m13.put(40, 40);

		for (Map.Entry<Integer, Integer> entry : m13.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);

		}
	}

	public void q4p3() {
		Map<Character, Integer> m14 = new TreeMap();
		m14.put('!', 10);
		m14.put('@', 20);
		m14.put('#', 30);
		m14.put('$', 40);
		m14.put('%', 50);
		m14.put('^', 60);
		m14.put('&', 10);
		m14.put('*', 50);
		m14.put('(', 409);
		for (Map.Entry<Character, Integer> entry : m14.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);

		}
	}

	public void q4p4() {
		Hashtable<String, String> m15 = new Hashtable<>();
		m15.put("vel", "Selenium");
		m15.put("Ganesh", "framework");
		m15.put("Dinesh", "oracle");
		m15.put("Vengat", "corejava");
		m15.put("subash", "jira");
		for (Map.Entry<String, String> entry : m15.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);

		}
	}

	public void q5p1() {
		Map<Integer, String> m16 = new HashMap();

		m16.put(10, "java");
		m16.put(20, "sql");
		m16.put(30, "oops");
		m16.put(40, "Sql");
		m16.put(50, "oracle");
		m16.put(60, "DB");
		m16.put(10, "selenium");
		m16.put(50, "psql");
		m16.put(40, "Hadoop");

		for (Map.Entry<Integer, String> entry : m16.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
	}

	public void q5p2() {
		Map<Integer, Integer> m17 = new LinkedHashMap();
		m17.put(10, 10);
		m17.put(20, 20);
		m17.put(30, 30);
		m17.put(40, 40);
		m17.put(50, 50);
		m17.put(60, 60);
		m17.put(10, 10);
		m17.put(50, 50);
		m17.put(40, 40);
		for (Map.Entry<Integer, Integer> entry : m17.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}

	}

	public void q5p3() {
		Map<Character, Integer> m18 = new TreeMap();
		m18.put('!', 10);
		m18.put('@', 20);
		m18.put('#', 30);
		m18.put('$', 40);
		m18.put('%', 50);
		m18.put('^', 60);
		m18.put('&', 10);
		m18.put('*', 50);
		m18.put('(', 409);
		for (Map.Entry<Character, Integer> entry : m18.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
	}

	public void q5p4() {
		Hashtable<String, String> m19 = new Hashtable<>();
		m19.put("vel", "Selenium");
		m19.put("Ganesh", "framework");
		m19.put("Dinesh", "oracle");
		m19.put("Vengat", "corejava");
		m19.put("subash", "jira");
		for (Map.Entry<String, String> entry : m19.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}

	}
	
	public static void main(String[] args) {
		Map_2 ob = new Map_2();
		ob.q5p4();

	}

}
