package arrayprogram;

public class FindEvenOrOddElement {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8};
        System.out.print("Even elements are : ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.print("\n odd element are : ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
