package String;


import java.util.*;

public class PalindromeSubstring {

    public static String longestPalindromicSubstring(String str) {
        String result = "";
        if(str != null && str.length() == 0) return result;
        result = Character.toString(str.charAt(0));
        for(int s=0; s<str.length(); s++){
            int leftI = s-1;
            int rightI = s+1;
            String tmpRes = findMaxSubString(s,leftI,rightI,str);
            if(tmpRes.length() > result.length()){
                result = tmpRes;
            }
            tmpRes = findMaxSubString(s,leftI,s,str);
            if(tmpRes.length() > result.length()){
                result = tmpRes;
            }

        }
        return result;

    }

    private static String findMaxSubString(int currI,int leftI,int rightI, String str){
        String tmpRes ="";
        while(leftI >= 0 && rightI <= str.length()-1){
            char left = str.charAt(leftI);
            char right = str.charAt(rightI);
            if(left == right){
                System.out.println("++++++ "+leftI);
                System.out.println("++++++ "+rightI);
                tmpRes = str.substring(leftI,rightI+1);
                leftI--;
                rightI++;
            }else{
                break;
            }
            if(leftI < 0) break;
            if(rightI > str.length()-1) break;
        }
        return tmpRes;
    }

    public  static  void  main(String args[]){
        System.out.println("-------"+"abcd".substring(0,4));
        String r = longestPalindromicSubstring("mnbvabba");
        System.out.println("---------"+r);

        String r2 = longestPalindromicSubstring("abcbaplo");
        System.out.println("---------"+r2);

    }

}


