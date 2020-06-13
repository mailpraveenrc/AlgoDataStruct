public class BinarySearchRotated {

        public int search(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] >= nums[start]) {
                    if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                    else start = mid + 1;
                }
                else {
                    if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                    else end = mid - 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            BinarySearchRotated O = new  BinarySearchRotated();
            int[] i = new int[]{4,5,6,7,8,1,2,3};
            System.out.println(">>>>>>>>> "+O.search(i,1));

        }
    }

