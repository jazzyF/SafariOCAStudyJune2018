package staticstuff;

public class Y {
  static int x = 99;

  public static void main(String[] args) {

    Y myX = new Y();
    Y yourX = new Y();
    myX.x = 0; // line n1
//    Y.x = 0; // "better syntax"
    System.out.println(yourX.x);
//    System.out.println(Y.x);
  }
}
