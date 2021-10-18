package KR.Regular;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class Date {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();

        LocalDateTime localDateTime = localTime.atDate(localDate);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(localDate);
    }
}
