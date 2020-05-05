package ArrayPgm;

import java.util.Scanner;

public class AddUsingScannerInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rowsize of array");
		int rsize=sc.nextInt();
		System.out.println("Enter the columnsize of array");
		
		int csize=sc.nextInt();
		
		int[][] a=new int[rsize][csize];
		int [][] b=new int[rsize][csize];
		System.out.println("Eneter the element to array");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
			    a[i][j]=sc.nextInt();
			    b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display the array element");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			System.out.println("***********");
			for(int k=0;k<csize;k++)
			{
				System.out.print(b[i][k]+" ");
			}
			System.out.println();
		}

	}

}
