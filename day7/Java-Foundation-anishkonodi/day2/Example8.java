import java.util.Scanner;

class Example8 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num,count=0;
    System.out.println("enter the number ");
    num=s.nextInt();
    while(num !=0){
         num=num/10;
         count=count+1;
     }
    System.out.println(count);
  }
}