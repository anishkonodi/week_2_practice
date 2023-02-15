import java.util.Scanner;

class Interest {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int choice;
    double r, si, totalamount, pa, day, months, year;
    System.out.println("enter the principle amount ");
    pa = s.nextDouble();
    System.out.println("enter the rate of interest");
    r = s.nextDouble();
    System.out.println(" To enter the time period, select options ");

    System.out.println("FOR DAYS press 1");
    System.out.println("for month press 2");
    System.out.println("for year press 3");
    choice = s.nextInt();
    if (choice == 1) {
      System.out.println("enter the time period in days");
      day = s.nextDouble();
      r = (r / 100);
      day = (day / 365);
      si = (pa * day * r);
      totalamount = si + pa;
      System.out.println("enter the simple interest " + si);
      System.out.println("enter the total amount " + totalamount);
    } else if (choice == 2) {
      System.out.println("enter the time period in months");
      months = s.nextDouble();
      r = (r / 100);
      months = ((months * 31) / 365);
      si = (pa * months * r);
      totalamount = si + pa;
      System.out.println("enter the simple interest " + si);
      System.out.println("enter the total amount " + totalamount);
    } else if (choice == 2) {
      System.out.println("enter the time period in months");
      months = s.nextDouble();
      r = (r / 100);
      months = ((months * 31) / 365);
      si = (pa * months * r);
      totalamount = si + pa;
      System.out.println("enter the simple interest " + si);
      System.out.println("enter the total amount " + totalamount);
    } else if (choice == 3) {
      System.out.println("enter the time period in year");
      year = s.nextDouble();
      r = (r / 100);
      year = (year * 365) / 365;
      si = (pa * year * r);
      totalamount = si + pa;
      System.out.println("enter the simple interest " + si);
      System.out.println("enter the total amount " + totalamount);
    } else {
      System.out.println("Please enter valid choice");
    }
  }
}