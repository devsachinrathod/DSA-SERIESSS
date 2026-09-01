class Solution {
    
    boolean increasing = true;
    boolean decreasing = true;
    //1,9,2,2,3
    public boolean isMonotonic(int[] arr) {
        for(int i = 0;i< arr.length - 1; i++){
            if(arr[i] < arr[i+1]){ ///increasing
                increasing = false;
            }
            if(arr[i] > arr[i+1]){ ///Decreasing
                decreasing = false;//true ture truw truw
            }
        }
        System.out.println(increasing); //false
        System.out.println(decreasing); //true

        return increasing || decreasing; 
        
    }
    public static void main(String[] args) {
        
        int [] arr = {1,5,2,2,3};
        Solution s = new Solution();
        System.out.println(s.isMonotonic(arr));
    }
}