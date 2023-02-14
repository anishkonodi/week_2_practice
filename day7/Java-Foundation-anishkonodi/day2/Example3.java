import java.util.Scanner;

class Example3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int i = 1, j = 1, p = 0, sum = 0, num = 0;
    for (int k = 1; k <= 1000; k++) {
      p = 0;
      for (i = 1; i <= k / 2; i++) {
        if (k % i == 0) {
          p = p + i;
        }
      }
      if (k == p) {
        System.out.println(k);
      }
    }
  }
}
