// class Selection {


//     public static void main(String[]  args){
//          int[] arr = {4,5,3,2,1};
//          for(int i = 0; i < arr.length -1 ; i++){
//             int min = i;//0

//         for(int j = i; j < arr.length; j++){
//                 if(arr[j] < arr[min]){
//                   min = j;
//                 }
//             }
//             int temp = arr[i];4
//             arr[i] = arr[min];
//             arr[min] = temp;
          
//          }
//          for(int num : arr){
//             System.out.print(num + " ");
//          }
            


//     }
// }

class Selection {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j =i; i<arr.length; j++){
                if(arr[i] < arr[min]){    
                    min = j;

                }
            }
            int temp = arr[i];//4
            arr[i] = arr[min];
            arr[min] = temp;
        }
      for(int num : arr){
        System.out.print(num + " ");
      }
    }
}