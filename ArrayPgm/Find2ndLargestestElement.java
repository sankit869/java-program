package ArrayPgm;

public class Find2ndLargestestElement {

	public static void main(String[] args) {
		int[] a={2,3,6,5,7};
		
		int large=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(large<a[i])
			{
			    large=a[i];
			}
			
		}
		System.out.println(large);
		
		int sec_large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>sec_large && a[i]!=large)
			{
				sec_large=a[i];
			}
		}
		System.out.println(sec_large);
	}

}
