class Bubble{

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass " + i);
          for (int j = 0; j < arr.length - 1 - i; j++) {
            System.out.println(arr.length -1 - i);

                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}