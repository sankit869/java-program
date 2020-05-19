package stringprogram;

public class StringRevAndPrintSameFormate {
    public static void main(String[] args) {
        String str = "I LIVE IN BANGALORE";
        String  replaceStr = "";
        //O/P--> "E ROLA GN ABNIEVILI"
        String s [] = str.split("\\s");
        for (int i = str.length()-1; i >=0 ; i--) {
            replaceStr+=str.charAt(i);
        }
        replaceStr=replaceStr.replaceAll("\\s","");
        int n=0;
        int t=s[0].length()-1;
        for (int i = 0; i <replaceStr.length() ; i++) {
            System.out.print(replaceStr.charAt(i));
            if(i==t && n <s.length-1){
                System.out.print(" ");
                t+=s[++n].length();
            }
        }
    }
}
