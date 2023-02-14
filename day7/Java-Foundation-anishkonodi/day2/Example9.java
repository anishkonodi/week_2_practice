import java.util.Scanner;

class Example9 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, ecount = 0, ocount = 0, rem;
    System.out.println("enter the number ");
    num = s.nextInt();
    while (num != 0) {
      rem = num % 10;
      if (rem % 2 == 0) {
        ecount = ecount + 1;
      } else {
        ocount = ocount + 1;
      }
      num = num / 10;
    }
    System.out.println("even digits count in given number is  " + ecount);
    System.out.println("odd  digits count in given number is  " + ocount);
  }
}