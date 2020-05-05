package ArrayPgm;

import java.util.Scanner;

public class InsertElementUsingScannerFunction {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		 int[] a=new int[size];
		 
		 System.out.println("Enter the Element In array");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
			 System.out.println("Display The Element");
			 for(int j=0;j<a.length;j++)
			 {
				 System.out.println(a[j]);
			 }
		 

	}

}
