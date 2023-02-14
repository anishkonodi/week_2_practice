import java.util.Scanner;

class amountnotes {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int amount, a = 0, b = 0, c = 0;
    System.out.println("enter the amount");
    amount = s.nextInt();
    if (amount < 100) {
      System.out.println("error");
    } else {
      if (amount % 100 == 0) {
        a = amount / 500;
        amount = amount % 500;
        System.out.println("500 notes are" + a);
        if (amount >= 200) {
          b = amount / 200;
          amount = amount % 200;
          System.out.println("200 notes are" + b);
        }
        if (amount >= 100) {
          c = amount / 100;
          amount = amount % 100;
          System.out.println("100 notes are" + c);
        }
      } else {
        System.out.println("error");
      }
    }
  }
}
