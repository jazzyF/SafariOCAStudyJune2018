package liskovreturns;

import java.time.LocalDate;

class Y {
  public int doStuff() { return 1; }
}
class P extends Y {
  // surprise! assignment compatibilty only allowed
  // for object return types...
//  public short doStuff() {  return 1; }
}
class Q extends Y {
  // No surprise
//  public long doStuff() { return 1L; }
}
public class Ex2 {
}
