package StringPgm;

import java.util.Scanner;

public class CountNoOfWordSpaceInaString {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a String");
	      String s=sc.nextLine();
	      int word=1;
	      
	      for(int i=0;i<s.length();i++)
	      {
	    	  if(s.charAt(i)==' ')
	    	  {
	    		  word++;
	    	  }
	      }
         System.out.println("number of word is"+word);
         System.out.println("number of space is"+(word-1));
	}

}
