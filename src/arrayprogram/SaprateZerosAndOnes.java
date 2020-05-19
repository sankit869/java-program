package arrayprogram;

import java.util.Arrays;

public class SaprateZerosAndOnes {
    static void saprate0And1(int a []){
        int zero=0,one=1;
        for(int i: a){
            if(i==0) zero++;
            else one++;
        }
        for (int i = 0; i <a.length ; i++) {
            if(i<zero) a[i]=0;
            else a[i]=1;
        }
    }

    public static void main(String[] args) {
        int a [] = {1,1,0,0,0,1,0,0,1,1,0,1};
        saprate0And1(a);
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
