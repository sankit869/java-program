package ArrayPgm;

import java.util.Scanner;

public class FindoutSmallestElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraysize");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the element to array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			//System.out.print(a[i]+" ");
		}
		//System.out.println();
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
			
		}
		System.out.println(small);

	}

}
