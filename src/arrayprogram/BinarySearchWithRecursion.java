package arrayprogram;

public class BinarySearchWithRecursion {
    static int binarySearch(int a[], int li, int hi, int x){
        if(li<=hi){
           int m = (li+hi)/2;
           if(x==a[m]) return m;
           else if(x<a[m]) return binarySearch(a,li,m-1,x);
           else return binarySearch(a,m+1,hi,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5,6,7,8,9};
        int len = a.length-1;
        int x = 5;
        int r = binarySearch(a,0,len,x);
        if(r==-1) System.out.println("Element is not present");
        else System.out.println("element found is on index "+ r+" element is  "+ a[r]);
    }
}
