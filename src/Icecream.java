import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Icecream
{
    static int[] icecreamParlor(int m, int[] arr) {
        int[] resp = new int[2];
        Map<Integer,Integer> map= new HashMap<>();
        if (arr.length <2){
            return null;
        }
        else if(arr.length ==2){
            return arr;
        }else{

            for(int i=0;i<arr.length;i++){
                if(map.get(arr[i]) == null){
                    map.put(new Integer(arr[i]),new Integer(arr[i]));
                }
            }
            List<Integer> list = new ArrayList<Integer>(map.keySet());
            for(int i =0;i< list.size()-1;i++){
                if(list.get(i)+list.get(i+1) ==m){
                    resp[0] = list.get(i);
                    resp[1] = list.get(i+1);
                }
            }
        }
        return resp;
    }


    public static void main(String[] args) {
        int[] input = {1, 3, 4, 4, 6, 8};
        int[] res = icecreamParlor(7,input);
        System.out.println("Icecream.main"+res[0]+" "+res[1]);
    }

}
