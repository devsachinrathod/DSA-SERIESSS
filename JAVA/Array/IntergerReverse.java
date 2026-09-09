public class IntergerReverse {
        public static void main(String[] args) {
      int num = -123;
      int reverse = 0;
       int sign = num > 0 ? 1 : -1;
       num = Math.abs(num);
        while (num > 0) {
            System.out.println("from " + num);
            int digit = num % 10; 

             if (reverse > Integer.MAX_VALUE / 10 ||
                reverse < Integer.MIN_VALUE / 10) {
                return ;
            }
            reverse = reverse * 10 + digit; 
            num = num / 10 ;
        };
        System.out.println(reverse = reverse * sign);
    }

}
