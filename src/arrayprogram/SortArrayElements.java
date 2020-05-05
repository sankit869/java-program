package arrayprogram;

import java.util.Arrays;

public class SortArrayElements {
    public static void sort(int a []){
        int tmp = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 1; j <a.length ; j++) {
                if (a[j-1]>a[j]){
                    tmp = a[j-1];
                    a[j-1]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
    public static void sortWithArrays(int a []){
        Arrays.sort(a);
    }
    public static void displya(int a []){
        for (int i: a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a [] = {5,1,7,2,4,3,9};
//        sort(a);
        sortWithArrays(a);
        displya(a);
    }
}
