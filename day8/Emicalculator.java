import java.util.Scanner;

class Emicalculator {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double rateofinterest, emi, payableamount, loanamount, nmonth, interest;
    System.out.println("enter the loan amount");
    loanamount = s.nextDouble();
    System.out.println("enter the number of months");
    nmonth = s.nextDouble();
    System.out.println("enter the rate of interest");
    rateofinterest = s.nextDouble();
    emi = loanamount / nmonth;
    interest = (loanamount * rateofinterest) / 100;
    payableamount = loanamount + interest;
    System.out.println("the emi is : " + emi);
    System.out.println("the total interest is : " + interest);
    System.out.println("the total payable amount is : " + payableamount);
  }
}