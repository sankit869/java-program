package ArrayPgm;

public class Evenandoddnumberpresentinarray {

	public static void main(String[] args) {
		 
		int [] a={12,14,13,7,9,3,11,16};
		
		 int even_count=0;
		 int odd_count=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			 {
				even_count++; 
				
				System.out.println(a[i]);
			 }
			 else
			 {
				 odd_count++;
			 }
			 
			 
		 }
		 System.out.println(even_count);
		 System.out.println(odd_count);
		 
		 
	}

}
