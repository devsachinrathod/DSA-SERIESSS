 class IntegerReverse {
  int IntegerRev(int num) {
    int reverse = 0;
    while(num != 0) {
      int lastDigit = num % 10;
      reverse = reverse * 10 + lastDigit;
      num = num / 10;
    }
    return reverse;
  }
public static void main(String[] args) {
   IntegerReverse obj = new IntegerReverse();
   int lastDigit = obj.IntegerRev(12345);
    System.out.println(lastDigit);
  }
}
