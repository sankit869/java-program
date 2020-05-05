package stringprogram;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Ankit weds Rani", rev="";
        String str [] = s.split("\\s");
        for (int i = str.length-1; i >=0 ; i--) {
            rev=rev + str[i]+" ";
        }
        System.out.println(rev);
    }
}
