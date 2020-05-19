package RecursionProgram;

import java.util.Scanner;

public class FactorialUsingRecursion {
    static public int fact(int num){
        int factNum ;
        if(num==1) return 1;
        return factNum=fact(num-1)*num;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("provid number for find factorial");
       int num = sc.nextInt();
        System.out.println(FactorialUsingRecursion.fact(num));
    }
}
