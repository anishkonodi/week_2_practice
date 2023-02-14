import java.util.Scanner;

class Example16 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number to check strong or not :");
    int num, i = 1, fact = 1, rem = 0, strong = 0;
    num = s.nextInt();
    int temp = num;
    while (num != 0) {
      rem = num % 10;
      fact = 1;
      for (i = 1; i <= rem; i++) {
        fact = fact * i;
      }
      strong = strong + fact;
      num = num / 10;
    }
    if (temp == strong) {
      System.out.println("Yes it is Strong number");
    } else {
      System.out.println("It is not strong number");
    }

  }
}