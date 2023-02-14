import java.util.Scanner;
class Example2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      System.outprintln("enter the number to get table ");
    int num=s.nextInt();
    for(int i=1;i<=num;i++){
      int r=num*i;
      System.out.println(num+"*"+i+"="+r);
    }
  }
}