package StringPgm;

public class ConvertFirstCharToUpperCase {

	static String  convertUppercase(String s)
	{
		char ch=s.charAt(0);
		ch= Character.toUpperCase(ch);
	         String s1=ch+s.substring(1);
	         return s1;
	}
	public static void main(String[] args) {
		String s="qspider";
		System.out.println(convertUppercase(s));
       
	}

}
