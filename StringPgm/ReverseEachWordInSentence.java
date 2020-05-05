package StringPgm;
import java.util.Scanner;

public class ReverseEachWordInSentence {
  static String reverse(String s)
  {
	String[] word= s.split(" "); 
	String[]temp=new String[2];
	String finalsent="";
	String finalrevword="";
	for(int i=word.length-1;i>=0;i--)
	{
		String revword=word[i];
		//String finalrevword="";
	      finalrevword=finalrevword+revword+" ";
	

	      //temp[i]=finalrevword;
	      //word[i]=temp[i];
	      
	}
	System.out.println(finalrevword);
	
	return finalrevword;
  }
	public static void main(String[] args) {
		System.out.println("Enter a sentence:");
		Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
          s= reverse(s);
           System.out.println(s);
	}

}
