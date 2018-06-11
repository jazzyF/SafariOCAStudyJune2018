package staticstuff;

public class X {
  private int a = 99;

  static void showA(X x) {
    System.out.println("value of a is " + x.a);
  }

  public static void main(String[] args) {

    X myX = new X();
    X.showA(myX);
  }
}