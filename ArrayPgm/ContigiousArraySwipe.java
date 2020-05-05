package ArrayPgm;

public class ContigiousArraySwipe {
    static void display(int[] a)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+" ");
    	}
    }
	public static void main(String[] args) {
		int[] a={1,3,5,6,7,8};
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i]; //3
			a[i]=a[i-1]; //1
			a[i-1]=temp; // 3
		}
      display(a);
	}

}
