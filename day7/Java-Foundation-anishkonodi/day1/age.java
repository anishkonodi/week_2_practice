import java.util.Scanner;

class age {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int age = 0;
    System.out.println("enter number to check whether it is positive or negative ");
    age = s.nextInt();
    if (age >= 18) {
      System.out.println("eligible ");
    } else {
      System.out.println("not eligible");
    }
  }
}