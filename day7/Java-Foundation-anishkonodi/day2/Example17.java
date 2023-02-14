import java.util.Scanner;

class Example17 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, i = 1, fact = 1, rem = 0, strong = 0, temp = 1;
    while (temp <= 1000) {
      int k = temp;
      while (k != 0) {
        fact = 1;
        rem = k % 10;
        for (i = 1; i <= rem; i++) {
          fact = fact * i;
        }
        strong = strong + fact;
        k = k / 10;
      }
      if (temp == strong) {
        System.out.println(strong);
      }
      strong = 0;
      temp = temp + 1;
    }
  }
}