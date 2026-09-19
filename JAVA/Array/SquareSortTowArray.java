//  import java.util.Arrays;

// class Solution {
//     // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//     // Output: [1,2,2,3,5,6]

//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1;           // Last element of nums1's actual data
//         int j = n - 1;           // Last element of nums2
//         int k = m + n - 1;       // Last position in nums1 (total space)
        
//         // Merge backward from the end
//         while (i >= 0 && j >= 0) {
//             if (nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i];
//                 i--;
//             } else {
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//             k--;
//         }
        
//         // If nums2 has remaining elements, copy them
//         // (if nums1 has remaining, they're already in place)
//         while (j >= 0) {
//             nums1[k] = nums2[j];
//             j--;
//             k--;
//         }
        
//         System.out.println(Arrays.toString(nums1));
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 3, 0, 0, 0};
//         int m = 3;
//         int[] nums2 = {2, 5, 6};f
//         int n = 3;

//         Solution s = new Solution();
//         s.merge(nums1, m, nums2, n);
//         // Output: [1, 2, 2, 3, 5, 6]
//     }
// } 
    

