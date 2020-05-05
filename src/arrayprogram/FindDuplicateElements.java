package arrayprogram;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int a [] = {1,2,3,3,4,4,5};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i]==a[j] && i!=j){
                    System.out.print(a[j]+ " ");
                }
            }
        }
    }
}
