import java.util.Scanner;

class Leapyear {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int year;
    System.out.println("enter the year ");
    year = s.nextInt();
    if (year % 400 == 0) {
      System.out.println("its leap year");
    } else if (year % 100 == 0) {
      System.out.println("its not leap year");
    } else if (year % 4 == 0) {
      System.out.println("its leap year");
    } 
}