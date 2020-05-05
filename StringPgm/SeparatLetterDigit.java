package StringPgm;

import java.util.Scanner;

public class SeparatLetterDigit {
 
	 static void separate(String s)
	 {
		String digit="";
		String letter="";
		for(int i=0;i<s.length();i++)
		{
		   char ch=s.charAt(i);
		   if(Character.isDigit(ch))
		   {
			  digit=digit+ch; 
		
		   }
			  
		   else
		   {
			   letter=letter+ch;
		   }
		   
			   
		}
		System.out.println("Number of digit is" +digit);
		System.out.println("Number of letter is" +letter);
		
	 }
	 
	public static void main(String[] args) {
	 
		Scanner scr=new Scanner(System.in);
          System.out.println("Enter a String");
          String s=scr.nextLine();
          separate(s);
	}

}
