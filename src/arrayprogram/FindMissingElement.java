package arrayprogram;

public class FindMissingElement {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,6,7,8,9};

        int total;
        total = ((a.length+1)*(a.length+2))/2;
        for (int i = 0; i < a.length; i++) {
            total-=a[i];
        }
        System.out.println(total);




        int num = 1;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=num) {
                System.out.print(num+" ");
                num++;
            }
            num++;
        }
    }
}
