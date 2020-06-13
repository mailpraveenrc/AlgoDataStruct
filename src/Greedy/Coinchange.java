package Greedy;

public class Coinchange {

    public int coinChange(int[] coins, int amount) {
        int res=0;
        int N=coins.length;
        int[] sorted_c = sort(coins,N);
        for(int i=sorted_c.length-1;i>0 && amount >0;i--){
            while(sorted_c[i] <= amount){
                res++;
                amount = amount - sorted_c[i];
            }
        }
        if(amount > 0) return -1;
        return res;
    }

    public int[] sort(int[] coins,int N){
        if(coins == null || coins.length < 2) return coins;
        int pivot = coins.length/2;
        int[] left =new int[pivot];
        int[] right =new int[coins.length-pivot];
        for(int a=0;a<left.length;a++){
            left[a] = coins[a];
        }
        for(int b=pivot;b<coins.length;b++){
            right[b-pivot] = coins[b];
        }
        sort(left,N);
        sort(right,N);
        return merge(left,right,N);
    }

    public int[] merge(int[] left,int[] right,int N){
        if(left == null) return right;
        if(right == null) return left;

        int[] merge= new int[N];
        int i=0;
        int j=0;
        int k=0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                merge[k] = left[i];
                i++;
            }else{
                merge[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            merge[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            merge[k] = right[j];
            j++;
            k++;
        }
        return merge;
    }

    public static void main(String args[]){
        int[] a = {1,2,5};
        Coinchange o = new Coinchange();
        o.coinChange(a,11);
    }



    }
