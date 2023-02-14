import java.util.Scanner;

class Example5 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, i = 1, count = 0;
    System.out.println("enter the number to get factor");
    num = s.nextInt();
    for (i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}