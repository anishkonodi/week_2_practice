import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int stop;
    System.out.println("enter the stop value");
    stop=s.nextInt();
    
    for(int i=0;i<=stop;i++)
      {
        System.out.println(i);
      }
  }
}