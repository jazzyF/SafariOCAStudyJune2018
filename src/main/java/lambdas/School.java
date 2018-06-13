package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class SmartCriterion implements Predicate<Student> {
  public boolean test(Student s) {
    return s.getGrade() > 3.0F;
  }
}

class EarlyLetterCriterion implements Predicate<Student> {

  @Override
  public boolean test(Student s) {
    return s.getName().charAt(0) <= 'M';
  }
}

class LongStringPredicate implements Predicate<String> {

  @Override
  public boolean test(String s) {
    return s.length() > 4;
  }
}
public class School {
  public static <E> List<E> filter(List<E> ls, Predicate<E> crit) {
    List<E> out = new ArrayList<>();
    for (E s : ls) {
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
  public static <E> void showAll(List<E> ls) {
    for (E s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-------------------------");
  }

  public static Predicate<Student> getNotSmartPredicate() {
    return (Student s) -> {return s.getGrade() < 3.0F;} ;
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
    System.out.println("Smart using first lambda");
//    showAll(filter(ls, (Student s) -> {return s.getGrade() > 3.0F;}));
//    showAll(filter(ls, (s) -> {return s.getGrade() > 3.0F;}));
//    showAll(filter(ls, s -> {return s.getGrade() > 3.0F;}));
//    showAll(filter(ls, s -> /*{return*/ s.getGrade() > 3.0F/*;}*/));

    showAll(filter(ls, s -> s.getGrade() > 3.0F));

    showAll(filter(ls, new EarlyLetterCriterion()));
//    showAll(getEarlyLetters(ls, 'N'));

    List<String> text = Arrays.asList("Fred", "Jim", "Sheila", "Marianne");
    showAll(filter(text, new LongStringPredicate()));

    Predicate<Student> ps;
//    ps = (Student s) -> {return s.getGrade() > 3.0F;};
    ps = s -> s.getGrade() > 3.0F ;
    (ps).test(ls.get(0));

    ((Predicate<Student>)((Student s) -> {return s.getGrade() > 3.0F;}))
        .test(ls.get(0));
  }
}
