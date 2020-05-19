package arrayprogram;

public class ReverseArray {
    static void reverseArray(int a []){
        int tmp = 0;
        for (int i = 0; i <a.length/2 ; i++) {
            tmp = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=tmp;
        }
    }
    static void printArray(int a []){
        for (int i:a){
            System.out.print(i+" ");
        }
    }
    static void reverseArrayRecursion(int a [], int start, int end ){
        int tmp;
        if(start>=end) return;
        tmp=a[start];
        a[start]=a[end];
        a[end]=tmp;
        reverseArrayRecursion(a,start+1,end-1);
    }

    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8};
        reverseArrayRecursion(a,0,a.length-1);
        printArray(a);
    }
}
