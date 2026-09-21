import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public Boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                duplicate.add(nums[i]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
     int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Solution s = new Solution();
        boolean hasDuplicates = s.containsDuplicate(arr);
        System.out.println("Array contains duplicates: " + hasDuplicates);
        // Output: [1, 2, 2, 3, 5, 6]
    }
}
