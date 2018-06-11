package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TryDateTime {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
//    today = today.plusDays(7); // bad variable name for next week!
    LocalDate nextWeek = today.plusDays(7);
    System.out.println("today is " + today);
    System.out.println("next week is " + nextWeek);
    today.get(ChronoField.HOUR_OF_DAY);
//
    // a) report 0
    // b) fail to compile
    // c) throw an exception
  }
}
