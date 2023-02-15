import java.util.Scanner;

class Celsius {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("to convert celsius to Fahrenheit press 1 ");
    System.out.println("to convert Fahrenheit to celsius press 2 ");
    int tempcelsius, tempFahrenheit, temp;
    temp = s.nextInt();
    if (temp == 1) {
      System.out.println("enter the temperature in Celsius ");
      tempcelsius = s.nextInt();
      tempFahrenheit = (tempcelsius *(9/5)) + 32;
      System.out.println("After convert from celsius to Fahrenheit temperature is " + tempFahrenheit);
    } else if(temp==2){
      System.out.println("enter the temperature in Fahrenheit ");
      tempFahrenheit = s.nextInt();
      tempcelsius = ((tempFahrenheit - 32) * 5) / 9;
      System.out.println("After convert from Fahrenheit to celsius temperature is " + tempcelsius);
    }
    else{
      System.out.println("Please enter 1  OR 2 ! ");
    }
  }
}