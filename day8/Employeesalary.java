import java.util.Scanner;

class Employeesalary {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the employee salary ");
    int salary, netsalary;
    salary = s.nextInt();
    if (salary < 700000) {
      netsalary = salary;
      System.out.println("There is no tax applied tax is zero ");
      System.out.println("The net salary is :" +netsalary);
    } else {
      if (salary <= 900000) {
        netsalary = ((300000 * 5) / 100) + (((salary - 600000) * 10) / 10);
        System.out.println("The net salary is :" + netsalary);
      } else if (salary <= 120000) {
        netsalary = ((300000 * 5) / 100) + (((salary - 600000) * 10) / 10) + (((salary - 900000) * 15) / 100);
        System.out.println("The net salary is :" + netsalary);
      } else {
        netsalary = ((300000 * 5) / 100) + (((salary - 600000) * 10) / 10) + (((salary - 900000) * 15) / 100)
            + (((salary - 1200000) * 20) / 100);
        System.out.println("The net salary is :" + netsalary);
      }
    }
  }
}