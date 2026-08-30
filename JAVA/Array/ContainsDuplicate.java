import java.util.HashSet;
import java.util.Set;


class ContainsDuplicate{
  

  public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;

  }
  public static void main(String[] args) {
    ContainsDuplicate cd = new ContainsDuplicate();
    int[] nums = {1,2,3,4,5,6,7,8,9,4,10};
    System.out.println(cd.containsDuplicate(nums));
  }
}