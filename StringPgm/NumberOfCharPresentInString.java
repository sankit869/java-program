package StringPgm;

public class NumberOfCharPresentInString {
    static int getlength(String s)
    {
    	int count=0;
    	char[] ch=s.toCharArray();
    	
    	for(char obj:ch)
    	{
    		count++;
    	}
    	return count;
    	 
    }
	public static void main(String[] args){
		String s="india";
		System.out.println(getlength(s));

	}

}
