import java.util.Scanner;

class Calculator {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int res, num1, num2;
    System.out.println("enter the num1");
    num1 = s.nextInt();
    System.out.println("enter the num2");
    num2 = s.nextInt();
    System.out.println("To perform Addition            press 1: ");
    System.out.println("To perform Subtraction         press 2 : ");
    System.out.println("To perform Multiplication      press 3 : ");
    System.out.println("To perform Division            press 4: ");
    System.out.println("To perform Modulus operation   press 5 : ");
    int c = s.nextInt();
    if (c == 1) {
      res = num1 + num2;
      System.out.println("the addition of two number is : " + res);
    } else if (c == 2) {
      res = num1 - num2;
      System.out.println("the subtraction of two number is : " + res);
    } else if (c == 3) {
      res = num1 * num2;
      System.out.println("the Multiplication of two number is : " + res);
    } else if (c == 4) {
      res = num1 / num2;
      System.out.println("the Division of two number is : " + res);
    } else if (c == 5) {
      res = num1 % num2;
      System.out.println("the Modulus of two number is : " + res);
    } else {
      System.out.println("! Please enter valid operator within +,-,*,/,%  these : ");
    }
  }
}