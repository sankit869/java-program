package StringPgm;

public class SplitTheString {

	public static void main(String[] args) {
		String s="Qspider is an institution";
		String[] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}

	}

}
