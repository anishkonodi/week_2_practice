import java.util.Scanner;
class gross {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int g=0,bs=0,hra=0,da=0;
    System.out.println("enter the basic salary : ");
    bs=s.nextInt();
    hra=(89*bs)/100;
    da=(90*bs)/100;
    g=hra+bs+da;
    System.out.println("Gross salary is "+g);
  }
}
