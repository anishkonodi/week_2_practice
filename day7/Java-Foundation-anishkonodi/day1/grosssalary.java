import java.util.Scanner;

class grosssalary {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int g = 0, bs = 0, hra = 0, da = 0;
    System.out.println("enter the basic salary : ");
    bs = s.nextInt();
    if (bs <= 10000) {
      hra = (67 * bs) / 100;
      da = (78 * bs) / 100;
      g = hra + bs + da;
    } else if (bs <= 20000) {
      hra = (70 * bs) / 100;
      da = (80 * bs) / 100;
      g = hra + bs + da;
    } else {
      hra = (73 * bs) / 100;
      da = (87 * bs) / 100;
      g = hra + bs + da;
    }
    System.out.println("Gross salary is " + g);
  }
}
