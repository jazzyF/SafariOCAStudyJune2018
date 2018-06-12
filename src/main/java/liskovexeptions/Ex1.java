package liskovexeptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class X {
  public void doStuff() throws IOException {}
}

class A extends X {
  public void doStuff() throws FileNotFoundException {}
}

class B extends X {
  public void doStuff() throws RuntimeException {}
}

class C extends X {
  public void doStuff() {}
}

class D extends X {
//  public void doStuff() throws Exception {}
}
public class Ex1 {
}
