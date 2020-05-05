package stringprogram;

public class OccurationOfString {
    public static void main(String[] args) {
        String s = "ankitsharma";
        int count=0;
        for(char i='a'; i<='z'; i++){
            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(j)==i){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(i + " : "+count);
                count=0;
            }
        }
    }
}
