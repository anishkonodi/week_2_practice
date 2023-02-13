import java.util.Scanner;

class electricity {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int units;
    double bill = 0;
    System.out.println("enter the units");
    units = s.nextInt();
    if (units <= 50) {
      bill = units * 0.50;
    } else if (units <= 150) {
      bill = (50 * 0.50) + (units - 50) * 1.23;
    } else if (units <= 250) {
      bill = (50 * 0.50) + (100 * 1.23) + (units - 150) * 1.90;
    } else {
      bill = (50 * 0.50) + (100 * 1.23) + (100 * 1.90) + (units - 250) * 2.34;
    }
    System.out.println("The total bill is " + bill);
  }
}
