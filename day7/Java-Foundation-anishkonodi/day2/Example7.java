import java.util.Scanner;

class Example7 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int i = 1, count = 0, pc = 0;
    // int arr[] = new int[100];
    for (int k = 0; k <= 100; k++) {
      count = 0;
      for (i = 1; i <= k / 2; i++) {
        if (k % i == 0) {
          count++;
        }
      }
      if (count == 1) {
        pc++;
        if (pc % 2 == 1) {
          System.out.println(k);
        }
      }
    }
  }
}