import java.util.Scanner;

class weekdays {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int date;

    System.out.println("enter the week date");
    date = s.nextInt();
    if (date <= 7) {

      if (date == 1) {
        System.out.println("sunday");
      } else if (date == 2) {
        System.out.println("monday");
      } else if (date == 3) {
        System.out.println("tuesday");
      } else if (date == 4) {
        System.out.println("wednesday");
      } else if (date == 5) {
        System.out.println("thursday");
      } else if (date == 6) {
        System.out.println("friday");
      } else {
        System.out.println("saturday");
      }
    } else {
      System.out.println("enter valid date between 1-7 ");
    }
  }
}