package stringprogram;

import java.util.Arrays;

public class FirstCharUpCase {
    public static void main(String[] args) {
        String s = "ankit";
        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        int a [] = {3,1,5,2,7,2};
        Arrays.sort(a);
        for (int i: a){
            System.out.printf(i+" ");
        }
    }
}
