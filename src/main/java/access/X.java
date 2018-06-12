package access;

public class X {
  protected void doStuff() {}
}
class A extends X {
//  void doStuff() {}
}
class B extends X {
  public void doStuff() {}
}
class C extends X {
//  private void doStuff(){}
}