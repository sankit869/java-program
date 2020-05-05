package ArrayPgm;

public class DuplicateElementPresentInArray {

	public static void main(String[] args) {
		
		int[] a={1,14,14,23,22,23,6,6,7,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
				  System.out.println("Duplicate Element is :"+a[j]);	
				}
			}
		}

	}

}
