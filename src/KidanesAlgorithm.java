public class KidanesAlgorithm {
    public int maxSubArray(int[] nums) {
        if(nums == null) return -1;
        if(nums.length == 1) return nums[0];
        int global_sum = nums[0];
        int current_sum = nums[0];
        for(int i=1;i<nums.length;i++){
            current_sum = Math.max(nums[i],(nums[i]+current_sum));
            if(current_sum > global_sum){
                global_sum = current_sum;
            }
        }
        return global_sum;
    }
}
