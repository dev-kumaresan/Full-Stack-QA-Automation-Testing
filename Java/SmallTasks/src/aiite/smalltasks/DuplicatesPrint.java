package aiite.smalltasks;

public class DuplicatesPrint {
	public void PrintWithoutDuplicatesFromWord() {
		String name = "Kumaresan";
		String result = ""; // For storing After remove duplicates index = -1 (default)
		for (int i = 0; i < name.length(); i++) {
			char currentChar = name.charAt(i); // get each charater from array

			if (result.indexOf(currentChar) == -1) { // default index
				result += currentChar; // ""+K="K","K"+u="Ku","Ku"+m="Kum","Kum"+a="Kuma",
			} // "Kuma"+r="Kumar","Kumar"+e="Kumare","Kumare"+s="Kumares",
				// index a in 3rd index, so 3==-1 condition false,
				// skip the iteration, again
		} // "Kumares"+n="Kumaresn"

		System.out.println("String after removing duplicates (word) : " + result); // print Kumaresn

	}

	public void PrintWithoutDuplicatesFromSentence() {
		String sentence = "My name is Kumaresan and My initial is L";
		String result1 = "";
		String[] sentence_break = sentence.split(" ");
		String words[] = new String[sentence_break.length];
		for (int i = 0; i < sentence_break.length; i++) {

			words[i] = sentence_break[i];
		}
		for (int i = 0; i < words.length; i++) {
			if (result1.indexOf(words[i]) == -1) {
				result1 += words[i];
				result1 = result1.concat(" ");
			}
		}
		System.out.println("String after removing duplicates (sentence) : \n" + result1);
	}

	public void PrintWithoutDuplicatesNumbers() {
		  int j,temp;
	        int num[]={97,54,97,75,54};
	        
	        for(int i=0;i<num.length;i++)
	        {
	            for(j=i+1;j<num.length;j++)
	            {
	                if(num[i]>num[j])
	                {
	                temp=num[i];
	                num[i] = num[j];
	                num[j] = temp;
	                }
	            }
	        }
	        System.out.println("\n\nAfter removed :- \n");
	        System.out.println(num[0]);
	        for(int i=1;i<num.length;i++){
	            if(num[i]==num[i-1]){
	                continue;
	            }
	            else{
	                System.out.println(num[i]);
	            }
	        } 

	}

	public static void main(String[] args) {
		DuplicatesPrint DP = new DuplicatesPrint();
		DP.PrintWithoutDuplicatesFromWord();
		DP.PrintWithoutDuplicatesFromSentence();
		DP.PrintWithoutDuplicatesNumbers();
	}
}
