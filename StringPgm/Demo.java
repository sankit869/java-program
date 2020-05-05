package StringPgm;

import java.util.Scanner;

public class Demo{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		
		String s=sc.nextLine();
		String rev=" " ;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
             System.out.println("the reverse string is"+rev);
	}

}
