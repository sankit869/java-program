package ArrayPgm;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0; i<a.length;i++)
		{  
			
			System.out.print(a[i]+" ");
		    sum = sum+a[i];
		    System.out.println();
		}
		 System.out.println(sum);		
        double avg=sum/a.length;
        System.out.println(avg);
        
	}

}
