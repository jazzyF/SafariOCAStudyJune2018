package liststuff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static void breakMyList(List l) {
    l.add(LocalDate.now());
  }

  public static void main(String[] args) {
    List<String> al0 = Arrays.asList("Hello"/*, LocalDate.now()*/);
    List<String> al = new ArrayList<>(al0);
    al.add("Hello");

//    al.add(LocalDate.now());
//    breakMyList(al);
    System.out.println("item zero is " + al.get(0));
    System.out.println("item one is " + al.get(1));
    System.out.println("contains today ? " + al.contains(LocalDate.now()));
  }
}
