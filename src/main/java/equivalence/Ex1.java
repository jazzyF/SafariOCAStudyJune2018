package equivalence;

public class Ex1 {
  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println("equals?? " + sb1.equals(sb2));
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println("equals?? " + s1.equals(s2));
  }
}
