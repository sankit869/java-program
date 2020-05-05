package stringprogram;

public class ReverseEachWordChar {
    public static void main(String[] args) {
        String s = "Ankit weds Rani", rev="";
        String str [] = s.split("\\s");
        for (int i = 0; i < str.length; i++) {
            char[] c = str[i].toCharArray();
            for (int j = c.length-1; j >=0 ; j--) {
                rev = rev+c[j];
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }
}
