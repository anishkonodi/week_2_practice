import java.util.Scanner;

class Atm {
  Scanner s = new Scanner(System.in);
  int count = 0, wcount = 0;
  int pin = 1234,changepin;
  double accountBal = 10000;

  public void noOfNotes(int amount) {
    int five = 0, two = 0, one = 0;
    if (amount >= 500) {
      five = amount / 500;
      amount = amount % 500;
      System.out.println("500 notes : " + five);
    }
    if (amount >= 200) {
      two = amount / 200;
      amount = amount % 200;
      System.out.println("200 notes : " + two);
    }
    if (amount >= 100) {
      one = amount / 100;
      System.out.println("100 notes : " + one);
    }
  }

  public void withdraw() {
    System.out.println("Enter withdraw amount ");
    int amount = s.nextInt();
    if (amount < 100) {
      System.out.println("Min Withdraw amount should be 100 ");
    } else if (amount % 100 != 0) {
      System.out.println("Please enter multiples of 100 ");
    } else if (accountBal - amount < 500) {
      System.out.println("please maintain min bal");
    } else if (amount > 30000) {
      System.out.println("transaction limit is 30000 only");
    } else {
      accountBal = accountBal - amount;
      wcount++;
      System.out.println("Avaiable bal is : " + accountBal);
      noOfNotes(amount);
    }
  }

  public void deposite() {
    System.out.println("Enter Deposite amount");
    int amount = s.nextInt();
    if (amount < 100) {
      System.out.println("deposite amount should be atleat 100");
    } else if (amount % 100 != 0) {
      System.out.println("Please enter multiples of 100 ");
    } else if (amount > 50000) {
      System.out.println("Deposite limit is 50000 only");
    } else {
      accountBal = accountBal + amount;
      System.out.println("Avaiable bal is : " + accountBal);
    }
  }

  public void balEnquiry() {
    System.out.println("Your account balance is " + accountBal);
  }

  public void viewOptions() {
    System.out.println("1.Deposite");
    System.out.println("2.Withdraw");
    System.out.println("3.Bal Enquiry");
    System.out.println("4.Pin change");
    System.out.println("0.EXIT");
    System.out.println("Choose your option");
    int option = s.nextInt();
    if (option == 1) {
      deposite();
      confirm();
    } else if (option == 2) {
      if (wcount < 3) {
        withdraw();
      } else {
        System.out.println("Withdraw limit is 3");
      }
      confirm();
    } else if (option == 3) {
      balEnquiry();
      confirm();
    } else if (option == 0) {
      System.out.println("Thank you, Visit again");
    } 
    else if (option == 4) {
       pinChange();
       validate();
       confirm();
    }
    else {
      System.out.println("Invalid option");
    }
  }

  public void confirm() {
    System.out.println("Press 1 to contiue and 0 for EXIT");
    int option = s.nextInt();
    if (option == 1) {
      viewOptions();
    } else {
      System.out.println("Thank you");
    }
  }

  public void pinChange() {
    System.out.println("enter the new pin to chnage");
    int changepin = s.nextInt();
    pin = changepin;
  }

  public void validate() {
    int num;
    System.out.println("Enter your pin");
    num = s.nextInt();
    if (num == pin) {
      viewOptions();
    } else {
      count++;
      if (count < 3) {
        System.out.println("Incorrect pin, please try again");
        validate();
      } else {
        System.out.println("invalid pin, your card is blocked for the day");
      }
    }
  }

  public static void main(String args[]) {
    Atm obj = new Atm();
    obj.validate();
  }
}