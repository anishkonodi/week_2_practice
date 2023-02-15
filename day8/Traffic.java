import java.util.Scanner;

class Traffic {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int time = 0, choice;

    System.out.println("To know Morning(AM) traffic level press 1 ");
    System.out.println("To know Afternoon(PM) traffic level press 2");
    choice = s.nextInt();
    if (choice == 1) {
      System.out.println("Enter the time to check the traffic:");
      time = s.nextInt();
      if (time >= 1 && time <= 12) {
        if (time <= 7) {
          System.out.println("There is no traffic");
        } else if (time >= 7 && time <= 10) {
          System.out.println("It's heavy traffic");
        } else {
          System.out.println("It'low traffic");
        }
      }
    } else if (choice == 2) {
      System.out.println("Enter the time to check the traffic:");
      time = s.nextInt();
      if (time <= 12 && time >= 1) {
        if (time >= 1 && time <= 4) {
          System.out.println("its a low traffic");
        } else if (time <= 8) {
          System.out.println("It's heavy traffic");
        } else if (time <= 10) {
          System.out.println("It's a low traffic");
        } else {
          System.out.println("There is no traffic");
        }
      }
    } else {
      System.out.println("Please enter the valid choice");
    }
  }
}