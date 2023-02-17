import java.util.Scanner;

class Roman {

  Scanner s = new Scanner(System.in);

  public void intToroman() {
    int thPlace, hPlace, tPlace, onesPlace, num;
    String results;
    String[] thousands = { "", "M", "MM", "MMM" };
    String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
    System.out.println("enter the number to convert it into roman number");
    num = s.nextInt();
    if (num < 1) {
      System.out.println("invalid number");
    } else {
      thPlace = num / 1000;
      hPlace = (num % 1000) / 100;
      tPlace = (num % 100) / 10;
      onesPlace = num % 10;
      System.out.println("After converted to roman number : " + thousands[thPlace] + hundreds[hPlace] + tens[tPlace]
          + ones[onesPlace]);
    }
  }

  public static void main(String args[]) {
    Roman obj = new Roman();
    obj.intToroman();

  }
}