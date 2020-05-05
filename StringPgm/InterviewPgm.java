package StringPgm;

public class InterviewPgm {

	static void toUpperCase(String s)
	{
       String[] s1= s.split(" ");
		s="";
	    for(int i=0;i<s1.length;i++)
	    {
	    	//System.out.println(s1[i]);
	    	
	    	s1[i]=Character.toUpperCase(s1[i].charAt(0))+s1[i].substring(1);
	    	
	    	s+=s1[i]+" ";
	    	
	    	System.out.println(s1[i]);
	    }
		 
	    System.out.println(s);
	    
	}
	
	
	
	public static void main(String[] args) {
		String s="india is my country";
		
		toUpperCase(s);
	    
	    

	}

}
