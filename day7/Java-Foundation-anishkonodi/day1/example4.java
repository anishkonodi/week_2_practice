import java.util.Scanner;

class example4 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int basicsalary = 0;
    int bill1 = 0, bill2 = 0, bill3 = 0, total = 0;
    float p = 0;
    System.out.println("Enter salary and bills :");
    basicsalary = s.nextInt();
    bill1 = s.nextInt();
    bill2 = s.nextInt();
    bill3 = s.nextInt();
    total = bill1 + bill2 + bill3;
    p = (total * 100) / basicsalary;
    System.out.println("total shopping amount is" + total);
    System.out.println("percentage is" + p);
  }
}