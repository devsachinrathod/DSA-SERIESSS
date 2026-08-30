class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Sort left side
            quickSort(arr, low, pivotIndex - 1);

            // Sort right side
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2,4,3,35,6,4,46,464,643,546,3463,4,534,63,4,3,3535,35,5, 3, 8, 1, 2,4,3,35,6,4,46,464,643,546,3463,4,534,63,4,3,3535,
        5, 3, 8, 1, 2,4,3,35,6,4,46,464,643,546,3463,4,534,63,4,3,3535,
        5, 3, 8, 1, 2,4,3,35,6,4,46,464,643,546,3463,4,534,63,4,3,3535,35,34,534,53,5,345,435,3,53,45,4,5,335,5,35,345,43,53,5,45,45,4,54,53,5,35,34,5,53,532352,2,5,25,35,35,5,5,454};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}