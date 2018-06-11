package staticstuff;

class Parent {
  static void doStuff() {
    System.out.println("Parent.doStuff");
  }
}
class Child extends Parent {
  static void doStuff() {
    System.out.println("Child.doStuff");
  }
}
public class StaticDoesntOverride {
  public static void main(String[] args) {
    Parent p = new Child();
    Parent.doStuff();
    Child.doStuff();
    p.doStuff();
  }
}
