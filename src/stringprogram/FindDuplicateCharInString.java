package stringprogram;

import java.util.HashMap;

public class FindDuplicateCharInString {
    public static void findDuplicateChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char chars []= s.toCharArray();
        for (char c : chars){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for (char c : map.keySet()){
            if (map.get(c)>1){
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args) {
        String s = "john doe";
        findDuplicateChar(s);

    }
    public static void findDuplicate(String s){
        char c []= s.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            for (int j = i; j <c.length ; j++) {
                if (c[i]==c[j] && (i!=j)){
                    System.out.print(c[j]+" ");
                }
            }
        }
    }
}
