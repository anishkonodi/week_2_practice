import java.util.Scanner;

class Example11{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, esum= 0, osum = 0, rem;
    System.out.println("enter the number ");
    num = s.nextInt();
    while (num != 0) {
      rem = num % 10;
      if (rem % 2 == 0) {
        esum = esum + rem;
      } else {
        osum = osum + rem;
      }
      num = num / 10;
    }
    System.out.println("even digits sum in given number is  " + esum);
    System.out.println("odd  digits sum in given number is  " + osum);
  }
}