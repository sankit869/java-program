package StringPgm;

import java.util.StringTokenizer;

public class CountTokensOfString {

	public static void main(String[] args) {
		String s="Qspider";
		System.out.println(s.length());
		String str="I Love India";
		StringTokenizer s1=new StringTokenizer(str, " ");
		int count=s1.countTokens();
		
		System.out.println(count);
		

	}

}
