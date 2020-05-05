package ArrayPgm;

public class FindTheSumAndAvgOfAry {

	public static void main(String[] args) {
		int [] a={1,2,3,5,7,9};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			 sum= sum+a[i];
		}
		System.out.println(sum);
	   double Avg= sum/a.length;
	   System.out.println(Avg);

	}

}
