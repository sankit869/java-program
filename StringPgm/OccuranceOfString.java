package StringPgm;

import java.util.Scanner;

public class OccuranceOfString {
	public static void main(String[] args) {

		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s.charAt(j)==i)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(i+"="+count);
				count=0;
			}
		}
	}

}
