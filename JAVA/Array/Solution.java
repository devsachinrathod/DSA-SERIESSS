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
    public int firstUniqChar(String s) {

        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
    //loveleetcodtve
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        String s = "loveeezxtcodtve";
        Solution s1 = new Solution();
        System.out.println(s1.firstUniqChar(s));
    }
}