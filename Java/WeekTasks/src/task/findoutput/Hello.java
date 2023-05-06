/* QUESTIONS(Find the output)

QUESTION 1 :
------------
package org.test;

public class Hello {
	  public static void main(String[] args) {
	    for (int i = 1; i <= 100; i++) {
	      if (i == 5) {

	      }
	      System.out.println(i);

	    }

	  }

	}


Output :- 
	// print numbers from 1 to 100

	1
	.	
	.
	.
	100

-------------------------------------------------------------

QUESTION 2 :

package org.test;

public class Hello {
	  public static void main(String[] args) {
		  for (int i = 1; i <= 10; i++) {
		      if (i == 5) {
		        break;
		      }
		      System.out.println(i);

		    }

	  }

	}



Output :-

1
2
3
4






--------------------------------------------------------

QUESTION 3 :

package org.test;

public class Hello {
	  public static void main(String[] args) {
		    for (int i = 1; i <= 10; i++) {
		        if (i == 5) {
		          continue;
		        }
		        System.out.println(i);

		      }

	  }

	}

Output :-

	1
	2
	3
	4
	5
	6
	7
	8
	9
	10









QUESTION 4 : 

package org.test;

public class Hello {
	  public static void main(String[] args) {
		  for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(j);
		      }

		    }
	  }
}

Output :-
1
2
3
1
2
3
1
2
3









------------------------------------------------------------------

QUESTION 5 :

package org.test;
public class Hello {
	  public static void main(String[] args) {
		    for (int i = 1; i <= 3; i++) {
		        for (int j = 1; j <= 3; j++) {
		          System.out.println(i);
		        }

		      }
	  }
}
Output :-

1
1
1
2
2
2
3
3
3







---------------------------------------------------------------

QUESTION 6 :

package task.org.test;

public class Hello {
	  public static void main(String[] args) {
		  for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= i; j++) {
		        System.out.println(j);
		      }

		    }
	  }
}

output :-
1
1
2
1
2
3




QUESTION 7 :

package org.test;

public class Hello {
	  public static void main(String[] args) {
		   for (int i = 1; i <= 3; i++) {
			      for (int j = i + 1; j <= 3; j++) {
			        System.out.println(j);
			      }

			    }
	  }
}
	

Output :-

2
3
3





---------------------------------------------------------------


QUESTION 8 : 

package org.test;

public class Hello {
	  public static void main(String[] args) {
		   for (int i = 1; i <= 3; i++) {
			      for (int j = i + 1; j <= i; j++) {
			        System.out.println(j);
			      }

			    }
	  }
}







Output :-

	
	












// This because In every iteration occurs in nested for j=i+1 performs and check j<=i,

	which means i=1
			  j=i+1, 
	So,		  j=2
			 
	Now check in nested for j<=i, which means 2<=1
	this will be false, in each iteration got incremented so the condition will be false in every iteration, it does not goes to the inside loop, So the program gets terminated and ouputs nothing.

------------------------------------------------------------------


QUESTION 9 :

package org.test;

public class Hello {
	  public static void main(String[] args) {
		  int i=5;
	      if (i == 5) {
	        break;
	      }
	      System.out.println(i);
	  }
}


Console :-

	
	break cannot be used in outside of loop or a switch





------------------------------------------------------------------


QUESTION 10 :

package task.findoutput;

public class Hello {
	  public static void main(String[] args) {
	    int i=5;
	      if (i == 5) {
	        continue;
	      }
	      System.out.println(i);
	  }

	}

Console :- 

 		continue cannot be used in outside of loop
 		
 */

	









------------------------------------------------------------------