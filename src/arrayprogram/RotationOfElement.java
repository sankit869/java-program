package arrayprogram;

public class RotationOfElement {
    public static void leftRotaion(int a []){
        int tmp = a[0];
        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=tmp;
    }
    public static void show(int a []){
        for (int i: a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8};
        int tmp = a[a.length-1];
        for (int i = a.length-1; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0]=tmp;
        show(a);

    }
}
