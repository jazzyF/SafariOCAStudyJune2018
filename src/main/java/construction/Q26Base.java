package construction;

public class Q26Base {
  int x = 99;
// default not provided because we have an explicit constructor declared
  Q26Base() {
    System.out.println("zero arg constructor for base");
  }
  Q26Base(int x){ System.out.println("in base constructor x is " + x); }
}
class Q26Sub extends Q26Base {
  Q26Sub() {
    this(99); // passes control across.
    System.out.println("hello");
  }

  Q26Sub(int x) {
//    super();// implicit call fails! no Q26Base() no arg constructor...
    super(x + 13);
    System.out.println("in sub constructor, x is " + x);
  }
}