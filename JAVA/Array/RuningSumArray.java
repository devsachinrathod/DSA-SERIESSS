public class RuningSumArray {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            arr[i] = sum;

        }
        return arr;
    }


class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }

        return false;
    }
}

    sdds
}
public class RuningSumArray {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            arr[i] = sum;

        }
        return arr;
    }
}

