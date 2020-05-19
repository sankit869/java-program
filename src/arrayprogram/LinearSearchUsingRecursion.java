package arrayprogram;

public class LinearSearchUsingRecursion {
    static int linearSearch(int arr [], int l ,int r,int x){

        if (r < l)
            return -1;
        if (arr[l] == x)
            return l;
        if (arr[r] == x)
            return r;
        return linearSearch(arr, l+1, r-1, x);
    }

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5,6,7,8,9};
        int x = 9;
        int r = linearSearch(a,0,a.length-1,x);
        if(r==-1) System.out.println("Element is not present");
        else System.out.println("element indext locaton is "+ r);
    }
}
