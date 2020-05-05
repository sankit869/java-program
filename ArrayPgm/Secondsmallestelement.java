package ArrayPgm;

import java.util.Scanner;

public class Secondsmallestelement {
    
	public static void main(String[] args) {
		int[] a={10,11,12,13,14,6,3,-1};
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			
		}
		System.out.println(small);
		int sec_small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<sec_small && a[i]!=small)
			{
				sec_small=a[i];
			}
		}
		System.out.println("Second smallest number is"+sec_small);
		
	}

}
