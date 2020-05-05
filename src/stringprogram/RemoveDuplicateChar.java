package stringprogram;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "ankitsharma";
        String s1 = "";
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j <s1.length() ; j++) {
                if(s.charAt(i)!=s1.charAt(j))
                    s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
    public static String removeDup(String s,String s1){
        char chars [] = s.toCharArray();
        char ch [] = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < chars.length; j++) {
                if (ch[i]!=ch[j]){
                    s1=s1 + ch[j];
                }
            }
            break;
        }
        return s1;
    }
}
