package SearchSort;

import java.util.*;

public class BinarySearch {

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        for(int i=0;i<matrix.length;i++){
            int[] input = matrix[i];
            int left=0;
            int right= input.length;
            res =  binarysearch(input,left,right,target);
            if (res == true) return res;
        }
        return res;
    }
    public boolean binarysearch(int[] input,int left,int right,int target){

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (input[mid] == target)
                return true;
            if (input[mid] > target)
                return binarysearch(input, left, mid - 1, target);
            return binarysearch(input, mid + 1, right, target);
        }
        return false;
    }
    public static int binarySearch(int[] array, int target) {
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
         if (array[m] == target)
                return m;
         if (array[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static int binarySearchr(int[] array, int target) {
        int l = 0, r = array.length - 1;
        return bs(array,target,l,r);
    }

    private static int bs(int[] a, int t,int l,int r){
        if(l > r) 		return -1;
        int m = l+(r - l)/2;
        if(a[m] == t) return m;
        if(a[m] < t){
            return bs(a,t,m+1,r);
        }else{
            return bs(a,t,l,m-1);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if(nums.length <1)
            return res;
        if(nums.length == 1 && nums[0] == target){
            res[0] =0;
            res[1] =0;
            return res;
        }
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int pivot = left +(right - left)/2;
            if(nums[pivot] == target){
                res[0] = pivot;
                res[1] = pivot;
                right = pivot;
                left = pivot;
                break;
            }
            else if(nums[pivot] > target){
                right = pivot -1;
            }else{
                left = pivot+1;
            }
        }
        left =0;
        right = nums.length-1;

        boolean leftStart = true;
        boolean rightEnd = true;
        while(leftStart || rightEnd){
            left = res[0] ;
            right = res[1] ;
            if(leftStart){
                left = left-1;
                if(left >=0 && nums[left] == target){
                    res[0] = left;
                }else{
                    leftStart = false;
                }
            }
            if(rightEnd){
                right = right+1;
                if(right <= nums.length - 1 && nums[right] == target){
                    res[1] = right;
                }else{
                    rightEnd = false;
                }
            }
            if(leftStart == false&& rightEnd == false) return res;
        }
        return res;
    }


    public static void main(String args[]){
        int[][] inp = {
                        {1, 4, 7, 11, 15}
        };
        int[][] inp2 = {
                {1, 4}
        };
        BinarySearch o = new BinarySearch();

//        System.out.println("------------------"+o.searchMatrix(inp2,4));
        int[] i3 =     new int[]{1, 4, 7, 11, 15};

//        System.out.println("------------------"+o.searchMatrix(inp,150));
        System.out.println("-----------"+binarySearch(i3,15));

        int[] inpu = new int[]{0,0,0,1,2,3};
        int[] res = searchRange(inpu,0);
        System.out.println("------------------------"+res[0]);
        System.out.println("------------------------"+res[1]);
            }
}
