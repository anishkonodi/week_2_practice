import java.util.Scanner;

class Difference {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, sum = 0, rem, pro = 1, diff;
    System.out.println("enter the number ");
    num = s.nextInt();
    while (num != 0) {
      rem = num % 10;
      pro = pro * rem;
      sum = sum + rem;
      num = num / 10;
    }
    diff = pro - sum;
    System.out.println("different between sum and product in digits in given number is  " + diff);
  }
}