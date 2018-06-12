package abstractandinterfaces;
/*abstract class*/ interface X {
//  final int thingy = 99;
  // cannot declare "fields" in interfaces, but can in abstract classes.
  public abstract void doStuff();
}

abstract class Y /*extends*/ implements X {
  private int thingy;
//  public void doStuff() {}
//  abstract void blah();
}


public class Ex1 {
  public static void main(String[] args) {
//    X x = new Y();
//    X x = new X();
//    X.thingy = 100; // must be constant to be data part of interface
  }
}
