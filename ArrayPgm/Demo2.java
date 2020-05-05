package ArrayPgm;

public class Demo2 {

	int getOddOccurrence(int ar[], int n) 
	{
		int i;
		int res = 0;
		for (i = 0; i < n; i++) 
		{
			res = res ^ ar[i];
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Demo2 occur = new Demo2();
		int ar[] = new int[]{2, 3, 5, 4, 5};
		int n = ar.length;
		System.out.println(occur.getOddOccurrence(ar, n));
	}
	
}
