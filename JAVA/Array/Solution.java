import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            // if (set.size() > k) {
            //     set.remove(nums[i - k]);
            // }
        }

        return false;
    }

    public static void main(String[] args) {
     int[] nums = {2,1,4,5,3,1,0,2,11}; // 1-0-2-3   3-2=1
     int k = 2;

     System.out.println("Input array: " + Arrays.toString(nums));
      Solution solution = new Solution();
        boolean result = solution.containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);
    }
}
