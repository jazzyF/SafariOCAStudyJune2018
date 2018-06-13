package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Criterion<E> {
  boolean test(E s);
}

class SmartCriterion implements Criterion<Student> {
  public boolean test(Student s) {
    return s.getGrade() > 3.0F;
  }
}

class EarlyLetterCriterion implements Criterion<Student> {

  @Override
  public boolean test(Student s) {
    return s.getName().charAt(0) <= 'M';
  }
}

public class School {
  public static List<Student> filter(List<Student> ls, Criterion<Student> crit) {
    List<Student> out = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
        out.add(s);
      }
    }
    return out;
  }

//  public static List<Student> getEarlyLetters(List<Student> ls, char threshold) {
//    List<Student> out = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getName().charAt(0) < threshold) {
//        out.add(s);
//      }
//    }
//    return out;
//  }
  public static void showAll(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-------------------------");
  }

  public static void main(String[] args) {
    List<Student> ls = new ArrayList<>(
        Arrays.asList(
            new Student("Fred", 2.7F),
            new Student("Jim", 2.5F),
            new Student("Sheila", 3.7F),
            new Student("Mary", 3.2F)
        )
    );
    showAll(ls);
    System.out.println("Smart");
    showAll(filter(ls, new SmartCriterion()));
    showAll(filter(ls, new EarlyLetterCriterion()));
//    showAll(getEarlyLetters(ls, 'N'));
  }
}
