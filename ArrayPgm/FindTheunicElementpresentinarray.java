package ArrayPgm;

public class FindTheunicElementpresentinarray {

	public static void main(String[] args) {
		
		int [] a={1,2,2,3,4,4,7};
		
		for(int i=0;i<a.length;i++)
		{
		    boolean isDistinct=false;
		    for(int j=0;j<i;j++)
		    {
		    	if(a[i]==a[j])
		    	{
		    		isDistinct=true;
		    		break;
		    	}
		    }
		    if(isDistinct==false)
		    {
		    	System.out.println("Distinct Element is"+a[i]);
		    }
		}

	}

}
