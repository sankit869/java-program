package arrayprogram;

public class Find2ndLargestElement {
    public static void main(String[] args) {
        int a [] = {3,1,8,6,32,9};
        int larger = a[0];
        for (int i = 0; i < a.length; i++) {
            if (larger<a[i]){
                larger=a[i];
            }
        }
        System.out.println("Largest element is : "+larger);

        int seclarger = a[0];
        for (int i = 0; i < a.length; i++) {
            if (seclarger<a[i] && larger!=a[i]){
                seclarger=a[i];
            }
        }
        System.out.println("2nd Largest element is : "+seclarger);

    }
}
