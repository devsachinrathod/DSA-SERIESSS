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
  public int coinscheck(int n){
     int rows = 0;
     for(int i = 1; i< n; i++){
        if(n < i){
            break;
        }
        n = n- i; 
        rows++;
     }

     return rows;
  }

  public static void main(String[] args){
    Solution s1 = new Solution();
    System.out.println(s1.coinscheck(5));
  }
}