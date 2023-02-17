import java.util.Scanner;

class Example1 {
  Scanner s = new Scanner(System.in);

  public void isPerfect() {
    System.out.println("Enter number to check it is perfect or not");
    int num = s.nextInt();
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    if (sum == num) {
      System.out.println("perfect number");
    } else {
      System.out.println("not a perfect number");
    }
    confirm();
  }

  public void isPrime() {
    System.out.println("Enter number to check it is prime or not");
    int num = s.nextInt();
    int fc = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        fc++;
      }
    }
    if (fc == 1) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");
    }
    confirm();
  }

  public void confirm() {
    System.out.println("Enter 1 for continue 0 for EXIT");
    int option = s.nextInt();
    if (option == 1) {
      viewOptions();
    } else if (option == 0) {
      System.out.println("Thank you, visit again");
    }
  }

  public void viewOptions() {
    System.out.println("1. To check prime numebr");
    System.out.println("2. To check perfect numebr");
    System.out.println("Choose your option: ");
    int option = s.nextInt();
    if (option == 1) {
      isPrime();
    } else if (option == 2) {
      isPerfect();
    } else {
      System.out.println("invalid option");
    }
  }

  public static void main(String args[]) {
    Example1 obj = new Example1();
    obj.viewOptions();
  }
}