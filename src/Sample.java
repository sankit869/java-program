public class Sample {
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
    static void display(int a []){
        for (int i: a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a [] = {5,4,3,2,1,6,7,8,9};
        bubblesort(a,a.length);
        display(a);

    }
}
