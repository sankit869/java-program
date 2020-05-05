package ArrayPgm;

public class LargestArrayElements {

	public static void main(String[] args) {
		int [] a={10,25,3,7,9,2,0,-2};
		
		int large=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("Large number is"+large);

	}

}
