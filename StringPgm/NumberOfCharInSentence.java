package StringPgm;

import java.util.Scanner;

public class NumberOfCharInSentence {

	
	static int countChar(String s)
	{
	   String s1= s.replaceAll("\\s", "");
	 char[] ch= s1.toCharArray();
	 int count=0;
	 for(char obj:ch)
	 {
		count++; 
	 }
	 
	 return count;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
        countChar(s); 
	}

}
