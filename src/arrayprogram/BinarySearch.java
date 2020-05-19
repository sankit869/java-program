package arrayprogram;

public class BinarySearch {
    static int binarySearch(int a[], int li, int hi, int x){
        int m;
        while (li<=hi){
            m = (li+hi)/2;
            if(x==a[m]){ return m;}
            else if (x<a[m]) hi = m-1;
            else  li = m+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5,6,7,8,9};
        int len = a.length-1;
        int x = 1;
        int r = binarySearch(a,0,len,x);
        if(r==-1) System.out.println("Element is not present");
        else System.out.println("element found is on index "+ r+" element is  "+ a[r]);
    }
}
