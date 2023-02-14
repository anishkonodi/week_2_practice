import java.util.Scanner;

class Example13 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number to get reverse");
    int num, rev = 0, rem;
    num = s.nextInt();
    int temp = num;
    while (num != 0) {
      rem = num % 10;
      rev = (rev * 10) + rem;
      num = num / 10;
    }

    if (temp == rev) {
      System.out.println("it is palindrome");
    } else {
      System.out.println("it is not palindrome");
    }
  }
}