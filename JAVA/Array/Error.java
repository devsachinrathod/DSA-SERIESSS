public class Error {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};
        int [] newNums = new int[nums.length ];
        
        for(int i = 0; i < nums.length - 1; i++) {
            newNums[0] = nums[0];
         
            newNums[i + 1] = nums[i]+ nums[i + 1];

        }
        for(int i = 0; i < newNums.length; i++) {
            System.out.println(newNums[i]);
        }
    }
}
