package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class TryDateTime {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
//    today = today.plusDays(7); // bad variable name for next week!
    LocalDate nextWeek = today.plusDays(7);
    System.out.println("today is " + today);
    System.out.println("next week is " + nextWeek);
//    today.get(ChronoField.HOUR_OF_DAY);
    // a) report 0
    // b) fail to compile
    // c) throw an exception

    Period fourtyDays = Period.ofDays(40);
    LocalDate todayPlusFourty = today.plus(fourtyDays);
    System.out.println("fourty from now is " + todayPlusFourty);

    LocalDate nextMonth = LocalDate.now().plusMonths(1);
    System.out.println("one month from now is " + nextMonth);
    LocalDate nextMonthPlusFourty = nextMonth.plus(fourtyDays);
    System.out.println("one month from now plus fourty is " + nextMonthPlusFourty);

    Period oddPeriod = Period.of(1, 14, 465);
    System.out.println("oddPeriod is " + oddPeriod);
    Period normalized = oddPeriod.normalized();
    System.out.println("normalized is " + normalized);
    // a) P1Y14M465D
    // b) P3Y2M100D
    // c) P2Y2M465D
    // d) P2Y14M100D
    // e) fails!

    DateTimeFormatter form = DateTimeFormatter.ofPattern(
        "'Today is 'dd / MMMM / yyyyy");
    System.out.println("Today is " + form.format(today));
  }
}
