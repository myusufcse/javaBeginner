package date_time_locale;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate lDate = LocalDate.now();
        LocalDate lDate1 = LocalDate.of(2015,8,05 );
        System.out.println(lDate);
        System.out.println(lDate1.getDayOfWeek());
        System.out.println(lDate.isAfter(lDate1));

        LocalTime lTime = LocalTime.now();
        System.out.println(lTime);
        System.out.println(lTime.getHour());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime lDateTime = LocalDateTime.now();
        System.out.println(lDateTime);
        System.out.println(lDateTime.minusNanos(1000000));

        lDateTime = LocalDateTime.of(lDate,lTime);
        System.out.println(lDateTime);

        LocalDate birthDate = LocalDate.of(1990, Month.SEPTEMBER,24);
        Period age = Period.between(birthDate,lDate); //we can also use Duration

        System.out.println("My age is : "+age);


        System.out.println(Duration.ofHours(1).getSeconds());
        System.out.println(Instant.now());

        ZoneId be = ZoneId.systemDefault();
        ZoneId in = ZoneId.of("UTC+05:30");
        ZonedDateTime inTime = ZonedDateTime.of(lDateTime,be);
        System.out.println("BE Time : "+inTime);
        System.out.println("IN Time : "+inTime.withZoneSameInstant(in));
        System.out.println("IN Time : "+inTime.withZoneSameInstant(in).getHour());

        String pattern = "EE', 'd' of 'MMMM YYYY' at 'HH:mm z";
        DateTimeFormatter dtfrmt = DateTimeFormatter.ofPattern(pattern, Locale.US);

        System.out.println("IN Time : "+dtfrmt.format(inTime.withZoneSameInstant(in)));
        System.out.println(Instant.now().atZone(in));
        System.out.println(Period.ofDays(3).getDays());

    }
}
