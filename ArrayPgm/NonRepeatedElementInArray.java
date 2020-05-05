package ArrayPgm;

import java.util.Scanner;

public class NonRepeatedElementInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int length=sc.nextInt();
		int[] a=new int[length];
		
		 int count=0,flag=0;
		 System.out.println("Enter the Element to Array");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
			 
					 
		 }
		 System.out.println("Non repeated element ");
		for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<a.length;j++)
		   {
			   if(i!=j)
			   {
				  if(a[i]!=a[j])
				  {
					  flag=1;
				  }
				  else
				  {
					  flag=0;
					  break;
				  }
			   }
		   }
			   if(flag==1)
			   {
				   count++;
				   System.out.print(a[i]+" ");

			   }
		   }
		   System.out.println();
		   System.out.println("Number of non repeated element is:"+count);
		}
		

	}


