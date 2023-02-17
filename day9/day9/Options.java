import java.util.Scanner;
class Options {
  
     public void isPalindrome() {
      Scanner s = new Scanner(System.in);
      System.out.println("enter the number to get reverse");
      int num, rev = 0, rem;
      num = s.nextInt();
      int temp = num;
      while (num != 0) {
        rem = num % 10;
        rev = (rev * 10) + rem;
        num = num / 10;
      }
  
      if (temp == rev) {
        System.out.println("it is palindrome");
      } else {
        System.out.println("it is not palindrome");
      }
    }
  

  
  public void isPerfect() {
    Scanner s = new Scanner(System.in);
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
  }


  public void isPrime() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to check it is prime or not");
    int num = s.nextInt();
    int fc = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        fc++;
      }
    }
    if (fc == 1) {
      System.out.println("It's prime number");
    } else {
      System.out.println("It's not a prime number");
    }
  }


public static void main(String args[]) {
  Scanner s=new Scanner(System.in);
  Options obj = new Options();
  int choice;
  System.out.println("enter the choice ");
  
  System.out.println("Choose your option: ");
  System.out.println("1. To check prime numebr");
  System.out.println("2. To check perfect numebr");
  System.out.println("3. To check palindrome numebr");
  choice=s.nextInt();
  if(choice==0){
    System.out.println("enter valid choice");
    choice=s.nextInt();
  }
  while(choice!=0){
  System.out.println("Choose your option again: ");
  choice=s.nextInt();
    if(choice==1){
      obj.isPrime();
    }
    else if(choice==2){
      obj.isPerfect();
    }
    else if(choice==3){
        obj.isPalindrome();
      }
      else if(choice==0){
        System.out.println("Thank you :");
        break;
      }
    else{
      System.out.println("invalid option");
    }
   System.out.println("Choose your option to check again: ");
  System.out.println("1. To check prime numebr");
  System.out.println("2. To check perfect numebr");
  System.out.println("3. To check palindrome numebr");
  System.out.println("to terminate press 0");
  }
}
}
