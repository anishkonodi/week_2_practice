class Defaultvalues {
  int i;
  short h;
  float b;
  long g;
  double d;
  char c;
  boolean e;

  public void m1() {
  
       System.out.println("int value: " + i);
      System.out.println("short value: " + h);
      System.out.println("long value: " + g);
       System.out.println("float value: " + b);
      System.out.println("char value: " + c);
      System.out.println("boolean value: " + e);
    }

  public static void main(String args[]) {
    defaultvalues obj = new defaultvalues();
    obj.m1();
  }
}