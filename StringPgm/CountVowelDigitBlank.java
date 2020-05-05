package StringPgm;

import java.util.Scanner;

public class CountVowelDigitBlank {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int digit=0,vowel=0,space=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')	
		{
			vowel++;
		}
		
		
		else if(Character.isDigit(ch))
		{
			digit++;
		}
		else if(Character.isWhitespace(ch))
		{
			space++;
		}
		
		}
		System.out.println("number of vowel is"+vowel);
		System.out.println("number of dogit is"+digit);
		System.out.println("number of space is"+space);
	}
		

	}

	
