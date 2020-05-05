package arrayprogram;

public class ProductOf2ArrayAndLargestElement {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int b [] = {4,3,2,1};
        int c [] = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i]= a[i]*b[i];
            }
        }
        for(int i: c){
            System.out.print(i+" ");
        }
        int largest = c[0];
        for (int i = 0; i <c.length ; i++) {
            if (largest<c[i]){
                largest=c[i];
            }
        }
        System.out.println("Largest element is : "+ largest);

    }
}
