import java.util.Scanner;

class Incrementation {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("to know how pre and post incrementations enter number");
    int num = s.nextInt();
    int r;
    System.out.println("preincrement operations");
    r = ++num + (++num);
    System.out.println("preincrement operations for given number" + r);

    System.out.println("postincrement operations");
    r = (num++) + (num++);
    System.out.println("postincrement operations for given number" + r);

    System.out.println("mixed operations operations");
    r = (++num) + (num++);
    System.out.println("mixed pre and post operations for given number" + r);

  }
}

// if num=2
// (2=2+1=3) + (3=3+1=4)=7