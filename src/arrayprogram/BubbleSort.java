package arrayprogram;

public class BubbleSort {
    static void bubblesort(int a[],int n){
        if(n==1) return;
        for (int i = 0; i < n-1; i++) {
            if(a[i] > a[i+1]){
                int tmp= a[i];
                a[i]=a[i+1];
                a[i+1]=tmp;
            }
        }
        bubblesort(a,n-1);
    }
    static void bubblesort(int a []){
        int tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
    static void display(int a []){
        for (int i: a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a [] = {5,4,3,2,1,6,7,8,9};
        bubblesort(a);
        display(a);

    }
}
