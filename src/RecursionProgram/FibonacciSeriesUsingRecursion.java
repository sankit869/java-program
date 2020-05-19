package RecursionProgram;

public class FibonacciSeriesUsingRecursion {
    static  int  n,n1=0,n2=1;
    public static void fibonacci(int num){
        if(num>0){
            n=n1+n2;
            n1=n2;
            n2=n;
            System.out.printf(n+" ");
            fibonacci(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.printf("fabinacci series %d %d ",n1, n2);
        fibonacci(10);
    }
}
