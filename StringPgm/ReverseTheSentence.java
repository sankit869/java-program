package StringPgm;

public class ReverseTheSentence {

	public static void main(String[] args) {
		String s="I Love MyIndia";
		String finalstr="";
		String[] words=s.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			finalstr=finalstr+words[i]+" ";
		}
		
         System.out.println(finalstr);
	}

}
