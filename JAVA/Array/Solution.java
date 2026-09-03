// class Solution {
    
//     boolean increasing = true;
//     boolean decreasing = true;
//     //1,2,2,3
//     public boolean isMonotonic(int[] arr) {
//         for(int i = 0;i< arr.length - 1; i++){
//             if(arr[i] < arr[i+1]){ ///increasing
//                 increasing = false; false 
//             }
//             if(arr[i] > arr[i+1]){ ///Decreasing
//                 decreasing = false;// false
//             }
//         }
//         System.out.println(increasing); //
//         System.out.println(decreasing); //true

//         return increasing || decreasing; 
        
//     }
//     public static void main(String[] args) {
        
//         int [] arr = {1,5,2,2,3};
//         Solution s = new Solution();
//         System.out.println(s.isMonotonic(arr));
//     }
// }


class Solution {

    public boolean canJump(int[] arr) {

        int maxReach = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
        }

        return true;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] arr = {2, 3, 1, 1, 4};

        System.out.println(s.canJump(arr));
    }
}