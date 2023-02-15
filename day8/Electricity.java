import java.util.Scanner;

class Electricity {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int units;
    double bill = 0;
    System.out.println("enter the units");
    units = s.nextInt();
    System.out.println("enter the percentage of gst");
    double gst = s.nextDouble();

    if (units <= 50) {
      bill = units * 0.50;
    } else if (units <= 150) {
      bill = (50 * 0.50) + (units - 50) * 1.23;
    } else if (units <= 250) {
      bill = (50 * 0.50) + (100 * 1.23) + (units - 150) * 1.90;
    } else {
      bill = (50 * 0.50) + (100 * 1.23) + (100 * 1.90) + (units - 250) * 2.34;
    }
    gst = (bill * 10) / 100;
    bill = bill + gst;
    System.out.println("The total bill is " + bill);
  }
}