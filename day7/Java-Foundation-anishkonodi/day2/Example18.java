import java.util.Scanner;

class Example18 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num,count=0,amg=1,temp=1,a=0,b=1,rem=1;
   // System.out.println("enter the number ");
   // num=s.nextInt();
    while(temp<=1000){
    num=temp;
    int t=num;
    //System.out.println(num+temp+t);
    while(num !=0){
      num=num/10;
      count=count+1;
     }
   // System.out.println(num+count+temp
    while(temp !=0){
      rem=1;
      for(int i=1;i<=count;i++){
        rem*=(temp%10);
       
     }
      a=a+rem;
      temp=temp/10;
    }
    if(a==t){
    System.out.println(t);
    }
   temp=temp+1;
    }
  }
}