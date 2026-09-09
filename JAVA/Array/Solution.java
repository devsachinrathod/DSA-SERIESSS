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
    // public void CheckPalindrom(int n) {
    //   for(int i = 0;i< n/2; i++){
    //     if(n%10 == n/10){
    //         n = n/10;
    //     }
    //     else{
    //         System.out.println("Not Palindrom");
    //     }
    //   }
    // }
    public static void main(String[] args) {
      int num = -123;
      int reverse = 0;
       int sign = num > 0 ? 1 : -1;
       num = Math.abs(num);
        while (num > 0) {
            System.out.println("from " + num);
            int digit = num % 10; 

             if (reverse > Integer.MAX_VALUE / 10 ||
                reverse < Integer.MIN_VALUE / 10) {
                return ;
            }
            reverse = reverse * 10 + digit; 
            num = num / 10 ;
        };
        System.out.println(reverse = reverse * sign);
    }
}