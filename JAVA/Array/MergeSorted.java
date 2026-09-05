// class MergeSorted {

//     public void MergeArr(int[] arr, int[] arr2) {

//         int[] mergeArray = new int[arr.length + arr2.length];

//         int index = 0;

//         for (int i = 0; i < arr.length; i++) {
//             mergeArray[index] = arr[i];
//             index++;
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             mergeArray[index] = arr2[i];
//             index++;
//         }

//         for (int num : mergeArray) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String[] args) {

//         MergeSorted obj = new MergeSorted();

//         int[] arr = {1, 3, 5};
//         int[] arr2 = {2, 4, 6};

//         obj.MergeArr(arr, arr2);
//     }
// }

class MergeSorted {
    public void MergeArr(int[] arr, int[] arr2) {
        int [] mergeArray = new int[arr.length + arr2.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            mergeArray[index] = arr[i];
            index++;
        }
        for(int i = 0; i < arr2.length; i++){
            mergeArray[index] = arr2[i];
            index++;
        }

       for(int num : mergeArray){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr1 [] ={7,8,9};
        int arr2 [] = {2, 4, 6};
        MergeSorted obj = new MergeSorted();
        obj.MergeArr(arr1, arr2);
    }
}