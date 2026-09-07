public class FindSecondLargest {
    int[] nums = {2,3,5,7,8};
    public int findSecondLargest(int[] nums) {
        int max = 0;
        int secondMax = 0;
        for(int num : nums){
            if(max < num){
                secondMax = max; 
                max = num;
            }
            else if(secondMax < num && num != max){
                secondMax = num;

            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        FindSecondLargest findSecondLargest = new FindSecondLargest();  
        System.out.println(findSecondLargest.findSecondLargest(findSecondLargest.nums));
    }

}
