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

    public static boolean findPalindrome(String input){
        int leftI = 0;
        int rightI = input.length()-1;
        while(leftI < rightI){
            if(! (input.charAt(leftI) == input.charAt(rightI))){
                return  false;
            }
            leftI++;
            rightI--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int[] indices = new int[]{0,1};
        for(int i =1; i < s.length();i++){
            int[] even = expandAroundCenter(s,i-1,i);
            int[] odd = expandAroundCenter(s,i-1,i+1);
            int[] max = even[1] - even[0] > odd[1] - odd[0] ? even : odd;
            indices = indices[1] - indices[0] > max[1] - max[0] ? indices : max;
        }
        return s.substring(indices[0],indices[1]);
    }

    private static int[] expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return new int[]{L+1,R};
    }

    public  static  void  main(String args[]){
        System.out.println("-------"+"abcd".substring(0,4));
        String r = longestPalindromicSubstring("mnbvabba");
        System.out.println("---------"+r);

        String r2 = longestPalindromicSubstring("abcbaplo");
        System.out.println("---------"+r2);
        System.out.println(findPalindrome("aca"));
        System.out.println(findPalindrome("acca"));
        System.out.println(findPalindrome("acba"));
        System.out.println(findPalindrome("abc"));
        System.out.println(longestPalindrome("abcdsdfg"));
        // substring
        System.out.println("abc".substring(0,3));

    }

}


