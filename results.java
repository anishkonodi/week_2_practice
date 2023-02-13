import java.util.Scanner;

class results {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int pm, em, im;
    int project, external, internal, ts;

    System.out.println("enter the students marks in project external internal");
    pm = s.nextInt();
    em = s.nextInt();
    im = s.nextInt();
    if (em >= 50 && pm >= 50 && im >= 50) {
      internal = (10 * im) / 100;
      external = (20 * em) / 100;
      project = (70 * pm) / 100;
      ts = project + internal + external;
      if (ts >= 90) {
        System.out.println("grade A");
      } else if (ts >= 70) {
        System.out.println("grade B");
      } else {
        System.out.println("grade C");
      }
    } else if (pm <= 50) {
      System.out.println("project subject is failed and marks is " + pm);
    }
    if (im <= 50) {
      System.out.println("internal subject is failed and marks is " + im);
    }
    if (em <= 50) {
      System.out.println("external subject is failed and mark s  is " + em);
    }
  }
}