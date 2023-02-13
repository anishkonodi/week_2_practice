import java.util.Scanner;

class leap {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int year;
    int count = 0;
    System.out.println("enter the year ");
    year = s.nextInt();
    if (year % 4 == 0) {
      count = count + 1;
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          count = count + 1;
        }
      }
    }
    if (count >= 1) {
      System.out.println("its leap year");
    } else {
      System.out.println("its not leap year");
    }
  }
}