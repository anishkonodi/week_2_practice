import java.util.Scanner;

class Example15 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number to get factorial :");
    int num, i = 1, fact = 1;
    num = s.nextInt();

    for (i = 1; i <= num; i++) {
      fact = fact * i;
    }
    System.out.println("factorial of the given number is :  " + fact);
  }
}