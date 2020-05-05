package ArrayPgm;

public class SumOfEvenAndOddOfArrayElement {

	public static void main(String[] args) {
		int[] a={4,5,6,7,8,9,2,1};
		 int sum1=0;
		 int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			   sum1=sum1+a[i];
			   }
			else
				sum2=sum2+a[i];
			
		
		}
		System.out.println(sum1);
		System.out.println(sum2);
		/*for(int i=a.length-1;i>=0;i--)
		{
			
			//System.out.print(a[i]+" ");
		}*/

	}

}
