package liskovreturns;

import java.time.LocalDate;

class X {
  public CharSequence doStuff() { return null; }
}
class A extends X {
  public String doStuff() {  return null; }
}
class B extends X {
  public StringBuilder doStuff() { return null; }
}
class C extends X {
//  public LocalDate doStuff() { return null; }
}
class D extends X {
//  public Object doStuff() { return null; }
}
public class Ex1 {
}
