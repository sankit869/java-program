package stringprogram;

public class ReverseString {
    static String rev="";
    static String recurReverStr(String s, int i){
        if(i>=0){
            rev += s.charAt(i);
            recurReverStr(s, i - 1);
        }
        return rev;
    }
    static String reverseString(String s){
        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s = "testing";
        System.out.println(recurReverStr(s,s.length()-1));
    }
}
