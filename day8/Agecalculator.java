import java.util.Scanner;

class Agecalculator {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the birth year to know age :  ");
    int Birthyear = s.nextInt();
    int age;
    int currentyear = 2023;
    age = currentyear - Birthyear;
    System.out.println("The age of the person is : " + age);
    if (age >= 18) {
      System.out.println("The person is major and his age is : " + age);
    } else {
      System.out.println("The person is minor and his age is : " + age);
    }

  }
}