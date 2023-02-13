import java.util.Scanner;

class posorneg {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int num = 0;
    System.out.println("enter number to check whether it is positive or negative ");
    num = s.nextInt();
    if (num > 0) {
      System.out.println("positive number");
    } else if(num==0) {
      System.out.println("number is zero ");
    }
    else{
      System.out.println("negative number");
    }

  }
}