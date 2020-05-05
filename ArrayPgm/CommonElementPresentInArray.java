package ArrayPgm;

public class CommonElementPresentInArray {

	public static void main(String[] args) {
		int[] a={1,2,4,7,8,9};
		int[] b={9,5,0,6,4,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}

}
