class Mid{
     

    public static void main(String[] args) {
     int[] arr = {1, 2, 3, 4, 5, 17, 7, 8, 9, 10}; 
     // Index: 0 1 2 3 4 5 6 7 8 9 
     // Value: 1 2 3 4 5 17 7 8 9 10
        int st = 0;
        int end = arr.length-1;
        int mid = st+(end-st)/2;
        System.out.println("index is "+mid);
        System.out.println("last element is "+arr[end]);
        System.out.println("Mid element is " +arr[mid]);
        System.out.println("Mid element is " +arr[2]);
    }
}