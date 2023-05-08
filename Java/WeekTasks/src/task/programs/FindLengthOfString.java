package task.programs;

import java.util.Scanner;

public class FindLengthOfString {
	public static void alRight()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String : ");
	String tech = s.next();
	int index = tech.indexOf('h');
	System.out.println(tech.charAt(index));
	}
	public static void SeleniumAutomationtool()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String : ");
	String tool = s.next();
	int index1 = tool.indexOf('o');
	System.out.println(tool.charAt(index1));
	}
	public static void name()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String : ");
	String name = s.next();
	int index2 = name.indexOf('u');
	System.out.println(name.charAt(index2));
	}
	public static void language()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String : ");
	String language = s.nextLine();
	int index3 = language.indexOf('p');
	System.out.println(language.charAt(index3));
	}
	public static void phone()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String : ");
	String ph = s.next();
	int index4 = ph.indexOf('7');
	System.out.println(ph.charAt(index4));
	}
	
	public static void main(String[] args) {
			alRight();
			SeleniumAutomationtool();
			name();
			language();
			phone();
		
	
		
		
// ------------------------------------------------------------------------
//		for(int i=1;i<=2;i++)
//		{
//	    System.out.println("Test "+i+" set of string :-");
//		System.out.println("Enter the String 1 : ");
//		String name1 = s.next();
//		System.out.println("Enter the String 2 : ");
//		String name2 = s.next();
//		boolean check = name1.equals(name2);
//		if(check)
//		{
//			System.out.println("Equal");
//		}
//		else
//		{
//			System.out.println("Not Equal");
//		}
//		System.out.print("\n");
//		}
// -----------------------------------------------------------------
//		String word = "Welcome";
//		String at_replaced = word.replaceAll("[aeiouAEIOU]", "@");
//		System.out.println(at_replaced);
// ---------------------------------------------------------------------------
//	      String str = "Welcome To Java class @123";
//	        int capsCount = 0;
//	        int smallCount = 0;
//	        int numberCount = 0;
//	        int specialCount = 0;
//
//	        for (int i = 0; i < str.length(); i++) {
//	            char ch = str.charAt(i);
//	            if (ch >= 'A' && ch <= 'Z') {
//	                capsCount++;
//	            } else if (ch >= 'a' && ch <= 'z') {
//	                smallCount++;
//	            } else if (ch >= '0' && ch <= '9') {
//	                numberCount++;
//	            } else {
//	                specialCount++;
//	            }
//	        }
//
//	        System.out.println("caps count  : " + capsCount);
//	        System.out.println("small count : " + smallCount);
//	        System.out.println("number count: " + numberCount);
//	        System.out.println("Special char: " + specialCount);
// ----------------------------------------------------------------------------------
//		String str = "Welcome";
//        int vowelCount = 0;
//        int consonantCount = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                vowelCount++;
//            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//                consonantCount++;
//            }
//        }

//        System.out.println("vowels    = " + vowelCount);
//        System.out.println("consonant = " + consonantCount);
// ---------------------------------------------------------------------------
//		String word = "Welcome to java class";
//		System.out.println("The current word : " + word);
//		String ss = word.substring(0, 7);
//		System.out.println("After sub string  : " + ss);
// -----------------------------------------------------------------
//		String[] sw = word.split("l");
//		for (String ns : sw) {
//			System.out.println(ns);
//		}

// --------------------------------------------------------------------
//		String name1 = "Nisha";
//		String name2 = "Rengan";
//		String name3 = "NishaRengan";
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());

// ------------------------------------------------------------------------

//		System.out.println("Enter the String : ");
//		String word = s.nextLine();
//		boolean check = word.isEmpty();
//		if (check) {
//			System.out.println(check);
//		} else {
//			System.out.println(check);
//		}
// -----------------------------------------------------------------------------------
//		String w = "WelComeToJava";
//		char[] letters = w.toCharArray();
//		for (int i = 0; i < letters.length; i++) {
//			if (Character.isUpperCase(letters[i])) {
//				count++;
//			} else if (Character.isLowerCase(letters[i])) {
//				count1++;
//			}
//		}
//		int UpperCaseCount = count;
//		int LowerCaseCount = count1;
//		System.out.println("Upper Case Count : " + UpperCaseCount);
//		System.out.println("Lower Case Count : " + LowerCaseCount);

// -------------------------------------------------------------------------------
//		System.out.println("Enter the name in lower case :- ");
//		String name2 = s.next();
//		String name2_lc = name2.toUpperCase();
//		System.out.println("Changed to upper case :- " + name2_lc);
//----------------------------------------------------------------------------------
//		System.out.println("Enter the address :- ");
//		String address = s.nextLine();
//
//		if (address.contains("pincode-626101")) {
//			String space = address.replace("pincode-626101", " ");
//			System.out.println("Updated Address : " + space);
//		} else {
//			System.out.println("The address is invalid.");
//		}

// -------------------------------------------------------------------------------------
//		String word = "Welcome to java class";
//		System.out.println("Word : " + word);
//		String word_update = word.replace(" ", "#");
//		System.out.println("Updated word with : " + word_update);
//-----------------------------------------------------------------------------------------
////		for (int i = 1; i <= 2; i++) {
////			System.out.println("Enter the Phone no : ");
////			String ph = s.next();
////			if (ph.length() > 10) {
////				System.out.println("Not Valid");
////			} else {
////				System.out.println("valid");
////			}
//		}
// --------------------------------------------------------------------------------------
//		for (int i = 1; i <= 2; i++) {
//			System.out.println("Enter the Phone no : ");
//			String ph = s.next();
//			boolean e = ph.matches("\\d+");
//			if (ph.matches("\\d+")) {
//				System.out.println(e);
//			} else {
//				System.out.println(e);
//			}
//		}
//--------------------------------------------------------------------------------------------------
//		System.out.println("Enter the email id : ");
//		email = s.next();
//		boolean e = email.contains("@");
//		if (email.contains("@")) {
//			System.out.println(e);
//		} else {
//			System.out.println(e);
//		}
// -----------------------------------------------------------------------------------------------------
//		System.out.println("Enter the address :- ");
//		String address = s.nextLine();
//
//		if (address.contains("pincode")) {
//			System.out.println("The address is valid.");
//		} else {
//			System.out.println("The address is invalid.");
//		}

// -----------------------------------------------------------------------------------------------------	
//		System.out.println("Enter the email id : ");
//		email = s.next();
//		if (email.contains("@")) {
//			System.out.println("Valid email ID");
//		} else {
//			System.out.println("Not Valid");
//		}

// -------------------------------------------------------------------------------------------------------
//		Scanner s = new Scanner(System.in);
//		String input1, input2;
//		for (int i = 1; i <= 5; i++) {
//
//			System.out.println(i + " th time :- ");
//			System.out.println("Enter input form user 1 :-");
//			input1 = s.next();
//			System.out.println("Enter input form user 2 :-");
//			s.nextLine();
//			input2 = s.next();
//			if (i == 1 || i == 2 || i == 3) {
//				if (input1.equals(input2)) {
//					System.out.println("Equal");
//				} else {
//					System.out.println("Not Equal");
//				}
//				System.out.print("\n");
//			} else {
//				switch (i) {
//				case 4:
//				case 5:
//					if (input1.equalsIgnoreCase(input2)) {
//						System.out.println("Equal");
//					} else {
//
//						System.out.println("Not Equal");
//					}
//					System.out.print("\n");
//					break;
//				}
//			}
//
//		}
// --------------------------------------------------------------------------------------------------------
//		System.out.println(tech.length());
//		System.out.println(tool.length());
//		System.out.println(name.length());
//		System.out.println(program.length());
//		System.out.println(phone.length());
//		System.out.println(tech.lastIndexOf('o'));
//		System.out.println(tool.lastIndexOf('o'));
//		System.out.println(name.lastIndexOf('n'));
//		System.out.println(program.lastIndexOf(' '));
//		System.out.println(phone.lastIndexOf('8'));

	}

}
