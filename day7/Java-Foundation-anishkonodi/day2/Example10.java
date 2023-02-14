import java.util.Scanner;

class Example10 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, count = 0, sum = 0, rem;
    System.out.println("enter the number ");
    num = s.nextInt();
    while (num != 0) {
      rem = num % 10;
      sum = sum + rem;
      num = num / 10;
    }
    System.out.println("sum of digits in given number is  " + sum);
  }
}