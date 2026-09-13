 class IntegerReverse {
public static void main(String[] args) {
  int num = 124;

  for(int i = 0; i < 3; i++) {
    int lastDigit = num % 10;
    num = num / 10;
    System.out.println(lastDigit);
  }
}
}