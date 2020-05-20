package arrayprogram;

public class RotationUsingRecursion {
    static void leftRotation(int a [],int l,int h){
        int tmp = a[0];
        if(h==a.length) return;
        a[l]=a[h];
        leftRotation(a,l+1,h+1);
        a[a.length-1]=tmp;

    }
    static void rightRotation(int a[], int l,int h){
        int temp = a[a.length-1];
        if (h==0) return;
        a[h]=a[l];
        rightRotation(a,l-1,h-1);
        a[0]=temp;
    }
    static void display(int a[]){
        for (int i:a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int a1 [] = {1,2,3,4,5,6,7,8,9};
        leftRotation(a,0,1);
        rightRotation(a1,a.length-2,a.length-1);
        display(a);
        System.out.println();
        display(a1);
    }
}
