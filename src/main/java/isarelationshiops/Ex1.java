package isarelationshiops;

class Other extends Object  {
}
class Parent extends Object {
  public void doParentStuff() {}
}
class Child extends Parent {
  public void doChildStuff() {
    System.out.println("child stuff!");
  }
}
class OtherParent extends Object {
}
public class Ex1 {
  public static void main(String[] args) {
    OtherParent op = null/* cannot work!!! new Child()*/;
//    Child cc = (Child)op;
    Parent p = new Parent();
    Parent p1 = new Child();
//    Parent p2 = new Object();
    p.doParentStuff();
    p1 = new Parent();

    if (p1 instanceof Child) {
      ((Child) p1).doChildStuff();
    } else {
      System.out.println("oops, it's not a child, so I didn't do that");
    }
//    p1.doChildStuff(); // Did NOT change p1, but created a NEW expression with
    // type Child

    /*A) works, prints "child stuff!"
    B) crashes at runtime
    C) does not compile
    D) runs but does nothing
     */
  }
}
