import java.util.Arrays;

class TripelWithSmallerSum {
  public static int findTriplets(int[] arr, int sum) {
    // sum = 12, arr[] = [5, 1, 3, 4, 7]
    Arrays.sort(arr);
    // 1-3-4-5-7
    int i = 0;

    int count = 0;
    while (i < arr.length - 2) {
      int leftPointer = i + 1;
      int rightPointer = arr.length - 1;
      while (leftPointer < rightPointer) {
        if (arr[i] + arr[leftPointer] + arr[rightPointer] < sum) {
          // System.out.println(sum);

          count += rightPointer - leftPointer;
          leftPointer++;
        } else {
          rightPointer--;
        }

      }
      System.out.println(i++);

    }
    return count;

  }

  public static void main(String[] args) {/* ... */
    int[] arr = { 5, 1, 3, 4, 7 };
    int sum = 12;
    // System.out.println("Input array: " );
    System.out.println("Count of triplets: " + findTriplets(arr, sum));
    // System.out.println(findTriplets(arr, sum));

  }

}
