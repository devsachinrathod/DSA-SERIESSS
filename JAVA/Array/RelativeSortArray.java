// import java.util.Arrays;

// public class RelativeSortArray {
 

//     public static void main(String[] args) {
//         int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
//         int[] arr2 = {2,1,4,3,9,6};
//         int[] count = new int[1001];
        
//         for(int num : arr1){
//           count[num]++;
//         }
//         int[] result = new int[arr1.length];
//         int index = 0;
//         for(int i = 0; i < arr2.length; i++){
//             while(count[arr2[i]] > 0){
//                 result[index++] = arr2[i];
//                 count[arr2[i]]--;
//             }
//         }
//         for(int i = 0; i < count.length; i++){
//             while(count[i] > 0){
//                 result[index++] = i;
//                 count[i]--;
//             }
//         }
//         System.out.println(Arrays.toString(result));
//     }
// } 


import java.util.Arrays;


class RelativeSortArray{

     public  void relativeSortArray(int[] arr1 , int[] arr2){
       int[] freq = new int[1001];

       for(int num : arr1){
           freq[num]++;
       }
       int[] result = new int[arr1.length];
       int index = 0;
       for(int i = 0 ; i < arr2.length; i++){
           while(freq[arr2[i]] < 0 ){
               result[index++] = arr2[i];
               freq[arr2[i]]--;
           }
       }
       for(int i = 0; i < freq.length; i++){
           while(freq[i] > 0){
               result[index++] = i;
               freq[i]--;
           }
       }
        System.out.print(Arrays.toString(result));
        System.out.print("reached here");
        

    }
    public static void main(String[] args){
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
       RelativeSortArray r1 = new RelativeSortArray();
       r1.relativeSortArray(arr1, arr2);
    }
}