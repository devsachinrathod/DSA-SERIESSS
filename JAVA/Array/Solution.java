class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }

            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 3};

        Solution s = new Solution();
        // System.out.println(nums.length);
        for(int i = 0; i < nums.length -1; i++){
            System.out.println(nums[i]);
        }
        System.out.println(s.isMonotonic(nums));
    }
}