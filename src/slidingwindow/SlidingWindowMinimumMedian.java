package slidingwindow;

import java.util.Arrays;

public class SlidingWindowMinimumMedian {
        public double[] medianSlidingWindow(int[] nums, int k) {
            double[] response = new double[(nums.length-k)+1];
            int left =k-1;
            int right =0;
            while(left <= nums.length && right <= nums.length-k){
                response[right] =getSubArray(nums,left,right,k);
                left++;
                right++;
            }
            return response;
        }

        public double getSubArray(int[] input,int left,int right,int k){
            double res =0.0d;
            int[] tmp_arr = new int[k];
            int j=0;
            for(int i=right;i<=left;i++){
                tmp_arr[j] = input[i];
                j++;
            }
            Arrays.sort(tmp_arr);
            return findMedian(tmp_arr,k);
        }

        public double findMedian(int[] input,int k){
            if(k%2 ==0){
                double a = input[(k/2)-1];
                double b = input[((k/2)+1)-1];
                return (a+b)/2;
                //return input[(k/2)-1]+input[((k/2)+1)-1]/2;
            }else{
                return input[((k/2)+1)-1];
            }
        }
    public static void main(String args[]){
            SlidingWindowMinimumMedian o = new SlidingWindowMinimumMedian();
            int[] a = {1,4,2,3};
            double[] res = o.medianSlidingWindow(a,4);
        for(double d: res){
            System.out.println(d);
        }
    }
}
