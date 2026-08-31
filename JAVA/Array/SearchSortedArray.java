import java.util.ArrayList;

class SearchSortedArray{

   ArrayList<Integer> DuplicateValue = new ArrayList<>();

public ArrayList<Integer> search(int[] a, int target) {
        for(int i = 0; i < a.length; i++){
            if(a[i] == target){
                DuplicateValue.add(i); 
                
            }
        }
        
        return DuplicateValue;
    }
      public static void main(String[] args) {
          
          int [] arr = {2,4,5,2,3,5,8,9};
          int target = 5;
          SearchSortedArray s = new SearchSortedArray();
          System.out.println(s.search(arr, target));
      }

}