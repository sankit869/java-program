package arrayprogram;

public class SumOf2DArray {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr [] = new int[a.length];
        int tem = 0;
        for (int i = 0; i < a.length; i++) {
            tem=0;
            for (int j = 0; j <a[i].length ; j++) {
                tem+=a[i][j];
            }
            arr[i]=tem;
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
