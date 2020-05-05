package ArrayPgm;

import java.util.Scanner;

public class InsertElemen2dArrayUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int rsize=sc.nextInt();
		System.out.println("Enter the column size");
		int csize=sc.nextInt();
		int [][] a=new int[rsize][csize];
		System.out.println("Enter the element in array");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			 System.out.println();
		}
		
          
	}

}
