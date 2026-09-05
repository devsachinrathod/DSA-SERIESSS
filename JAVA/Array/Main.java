public class Main {

    public static void main(String[] args) {

        int[] nums = {3, 4, 2, 7, 4, 1};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] + nums[i] + 2 == target) {
                System.out.println("does exist");
            }
        }
    }
}