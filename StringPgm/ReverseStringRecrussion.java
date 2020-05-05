package StringPgm;

import java.util.Scanner;

public class ReverseStringRecrussion {
	Scanner scr=new Scanner(System.in);
	String str=scr.nextLine();
	String reverse="";
	int i=str.length()-1;
	String reverseString()
	{
		
		if(i>=0)
		{
			reverse +=str.charAt(i);
			i--;
			reverseString();
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		
		 System.out.println("Enter a string");
	    
       //System.out.println("Enter a string");
        ReverseStringRecrussion rsr=new ReverseStringRecrussion();
        System.out.println(rsr.reverseString());
      
      
	}
	
	

}
