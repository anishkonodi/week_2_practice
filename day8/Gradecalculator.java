import java.util.Scanner;
class Gradecalculator{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the score to get grade :");
    int score=s.nextInt();
    if(score>=90){
      System.out.println("Grade is A+");
    }
    else if(score>=70){
      System.out.println("Grade is A");
    }
    else if(score>=50){
      System.out.println("Grade is B+");
    }
    else if(score>=35){
      System.out.println("Grade is B");
    }
    else{
      System.out.println("Fail");
    }
    
  }
}