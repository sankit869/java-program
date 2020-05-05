package StringPgm;

public class SubString {

	public static void main(String[] args) {
		
		String s="My name is lipu";
		       
		       String[] s1= s.split(" ");
		       
		       System.out.println(s1.length);
		       
		
		//String str=s.substring(0, 9);
		
		//System.out.println(s1);
		       
		       for(int i=0;i<s1.length;i++)
		       {
		    	  
		    	 if(i!=2) 
		    	 {
		    		 System.out.println(s1[i]);
		    	 }
		    	 else
		    	 {
		    		 System.out.println(s1[i].replace("s", " "));
		    		 break;
		    	 }
		    	  
		  
		       }
		       
		       
		       
	}

}
