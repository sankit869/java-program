package ArrayPgm;

import java.util.Scanner;

public class Largestevenandsmallestodd {

	public static void main(String[] args) {
		
		
		int [] a={14,15,19,16,9,8,4,2};
		int largesteven=-1;
		boolean largestEvenValid=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				if(largestEvenValid==false)
				{
					largesteven=a[i];
					largestEvenValid=true;
				}
				else
				{
					largesteven=Math.max(largesteven, a[i]);
				}
			}
		}
       System.out.println("largest even number is"+largesteven);
       
       int smallestodd=-1;
       boolean smallestoddvalid=false;
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]%2!=0)
    	   {
    		   if(smallestoddvalid==false)
    		   {
    			   smallestodd=a[i];
    			   smallestoddvalid=true;
    			   
    		   }
    		   else
    		   {
    			   smallestodd=Math.min(smallestodd, a[i]);
    		   }
    	   }
       }
       
       System.out.println("smallest odd number is"+smallestodd);
	}

}
