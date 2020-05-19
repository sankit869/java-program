package arrayprogram;

public class LinearSearch {
    static int linearSearch(int a [], int x){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5,6,7,8,9};
        int x = 9;
        int r = linearSearch(a,x);
        if(r==-1) System.out.println("Element is not present");
        else System.out.println("element indext locaton is "+ r);
    }
}
