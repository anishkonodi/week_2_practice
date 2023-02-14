import java.util.Scanner;

class eveorodd{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = 0;
    System.out.println("enter number to check whether it is even or odd ");
    num = s.nextInt();
    if(num%2==0){
      System.out.println("It is even number");
        }
    else{
      System.out.println("It is odd number");
    }
    
  }
}