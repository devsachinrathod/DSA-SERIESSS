class SearchRotatedArray {

    public boolean search(int[] a, int target) {

        int st = 0;
        int end = a.length - 1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            // Target found
            if (a[mid] == target) {
                return true;
            }

            // ⭐ Duplicate case
            if (a[st] == a[mid] && a[mid] == a[end]) {
                st++;
                end--;
                continue;
            }

            // Left half is sorted
            if (a[st] <= a[mid]) {

                // Target is inside left sorted half
                if (a[st] <= target && target < a[mid]) {
                    end = mid - 1;
                } 
                else {
                    st = mid + 1;
                }

            }

            // Right half is sorted
            else {

                // Target is inside right sorted half
                if (a[mid] < target && target <= a[end]) {
                    st = mid + 1;
                } 
                else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
    
}