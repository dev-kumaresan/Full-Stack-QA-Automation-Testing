package aiite.smalltasks;

public class PlayWithWords {
	public static void main(String[] args) {
		String statement = "kumaresan from batch-3", name = "KUMARESAN", name2 = "kumaresan", empty = "", blank = " ",
				us = "   unwanted";

		System.out.println(name.startsWith("k")); // returns boolean
		System.out.println(name.endsWith("n")); // returns boolean
		System.out.println(statement.hashCode()); // returns int
		System.out.println(name.hashCode()); // returns int
		System.out.println(statement.length()); // returns int
		System.out.println(name.length()); // returns int
		System.out.println(statement.toUpperCase()); // returns string
		System.out.println(name.toLowerCase()); // returns string
		System.out.println(statement.indexOf('f')); // returns int
		System.out.println(name.lastIndexOf('A')); // returns int
		System.out.println(statement.equals(name)); // returns boolean
		System.out.println(name.equalsIgnoreCase(name2)); // returns boolean
		System.out.println(statement.contains("batch-3")); // returns boolean
		System.out.println(name.charAt(2)); // returns char
		System.out.println(statement.replace("kumaresan", "Kumaresan L")); // returns string
		System.out.println(name.isEmpty()); // returns boolean
		System.out.println(empty.isEmpty()); // returns boolean
		System.out.println(blank.isBlank()); // returns boolean
		System.out.println(us.trim()); // returns string (remove spaces)
		System.out.println(us); // with space
		System.out.println(statement.substring(4)); // returns string
		System.out.println(statement.substring(10, 22)); // returns string

	}

}
